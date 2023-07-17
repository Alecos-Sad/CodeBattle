package by.sadovnick;

import java.util.*;

public class AnagramRemover {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("listen", "silent", "enlist", "word", "ramp", "arm", "mary");

        List<String> result = removeAnagrams(input);
        System.out.println(result);
    }

    public static List<String> removeAnagrams(List<String> strings) {
        Map<String, String> anagramMap = new HashMap<>();

        for (String str : strings) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            // Используем отсортированную строку как ключ для группировки анаграмм
            anagramMap.put(sortedStr, str);
        }

        // Оставляем только одну строку из каждой группы анаграмм
        List<String> uniqueStrings = new ArrayList<>(anagramMap.values());

        return uniqueStrings;
    }
}
