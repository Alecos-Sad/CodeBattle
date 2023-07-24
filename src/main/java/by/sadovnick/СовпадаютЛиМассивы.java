package by.sadovnick;

import java.util.Arrays;
import java.util.HashSet;

public class СовпадаютЛиМассивы {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};

        boolean areArraysDifferent = areArraysDifferent(array1, array2);
        System.out.println("Массивы " + (areArraysDifferent ? "отличаются" : "совпадают"));
    }

    public static boolean areArraysDifferent(int[] array1, int[] array2) {
        // Проверка на одинаковую длину
        if (array1.length != array2.length) {
            return true;
        }

        // Сортировка массивов
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Постепенное сравнение элементов
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return true; // Массивы отличаются
            }
        }

        return false; // Массивы совпадают
    }


    public static boolean areArraysDifferent2(int[] array1, int[] array2) {
        // Проверка на одинаковую длину
        if (array1.length != array2.length) {
            return true;
        }

        // Создание хеш-множеств
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Заполнение хеш-множеств уникальными значениями из обоих массивов
        for (int num : array1) {
            set1.add(num);
        }

        for (int num : array2) {
            set2.add(num);
        }

        // Сравнение размеров хеш-множеств (должны быть одинаковыми)
        if (set1.size() != set2.size()) {
            return true;
        }

        // Если хеш-множества содержат разное количество уникальных значений, массивы отличаются
        return !set1.equals(set2);
    }
}
