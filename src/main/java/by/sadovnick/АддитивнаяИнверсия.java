package by.sadovnick;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Реализуйте функцию, которая возвращает массив аддитивных инверсий. Число, сложенное с аддитивным обратным, равно нулю.
 * Examples:
 * [-1,2,-3,4,5]  == solution([1,-2,3,-4,-5])
 * [-1,-1,-1,-10]  == solution([1,1,1,10])
 * [5,-25,-125]  == solution([-5,25,125])
 */
public class АддитивнаяИнверсия {
    public static void main(String[] args) {
        System.out.println(solution(List.of(-1, 2, -3, 4, 5)));
    }

    public static List<Integer> solution(List<Integer> numbers) {
        return numbers.stream()
                .map(num -> num * -1)
                .collect(Collectors.toList());
    }

}
