package by.sadovnick;

/**
 * Calculate sum of arithmetic progression from 1 to n.
 * 1  == solution(1)
 * 15  == solution(5)
 * 1275  == solution(50)
 */
public class ВычислениеСуммыАрифПрогрессии {
    public static void main(String[] args) {
        System.out.println(solution(50));
    }

    public static Integer solution(Integer n) {
        if (n == 0) {
            return 0;
        }
        return n + solution(n - 1);
    }
}
