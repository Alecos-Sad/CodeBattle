package by.sadovnick;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Create a function which returns the number of true values there are in an array.
 * Examples:
 * 4  == solution([true,true,false,true,false,true])
 * 5  == solution([false,true,false,true,true,true,true])
 * 1  == solution([false,false,false,true])
 */
public class СчитатьКоличествоИстинВМассиве {
    public static void main(String[] args) {
        System.out.println(solution(List.of(true, true, false, true, false, true)));
    }

    public static Integer solution(List<Boolean> facts) {
        List<Boolean> cloBool = facts.stream()
                .filter(bool -> bool.equals(true))
                .collect(Collectors.toList());
        return cloBool.size();
    }
}
