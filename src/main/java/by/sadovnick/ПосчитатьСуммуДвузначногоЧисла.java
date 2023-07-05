package by.sadovnick;

/**
 * Посчитайте сумму цифр двузначного целого числа n.
 *
 * Примеры:
 *
 * 3  == solution(12)
 * 5  == solution(23)
 * 1  == solution(10)
 * 18  == solution(99)
 */
public class ПосчитатьСуммуДвузначногоЧисла {
    public static void main(String[] args) {
        System.out.println(solution(52));
    }

    public static Integer solution(Integer n) {
        String string = n.toString();
        int a = Integer.parseInt(string.substring(0, 1));
        int b = Integer.parseInt(string.substring(1, 2));
        return a + b;
    }
}
