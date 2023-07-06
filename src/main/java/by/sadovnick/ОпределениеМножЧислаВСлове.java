package by.sadovnick;

public class ОпределениеМножЧислаВСлове {
    public static void main(String[] args) {
        System.out.println(solution("Hies"));
    }

    public static Boolean solution(String word) {
        char[] chars = word.toCharArray();
        return chars[chars.length - 1] == 's';
    }
}
