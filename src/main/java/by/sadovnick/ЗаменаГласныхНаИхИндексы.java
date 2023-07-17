package by.sadovnick;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ЗаменаГласныхНаИхИндексы {
    public static void main(String[] args) {
        List<String> sol = List.of("clajara", "pathan", "alaxar", "javascrapt");
        solution(sol).forEach(System.out::println);
    }

    public static List<String> solution(List<String> words) {
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        List<String> modifiedWords = new ArrayList<>();

        for (String word : words) {
            StringBuilder modifiedWord = new StringBuilder();
            for (char c : word.toCharArray()) {
                char lowercaseChar = Character.toLowerCase(c);
                if (vowels.contains(lowercaseChar)) {
                    int index = vowels.indexOf(lowercaseChar);
                    modifiedWord.append(index);
                } else {
                    modifiedWord.append(c);
                }
            }
            modifiedWords.add(modifiedWord.toString());
        }
        return modifiedWords;
    }
}
