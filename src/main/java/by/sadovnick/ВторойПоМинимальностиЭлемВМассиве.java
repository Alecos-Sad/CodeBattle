package by.sadovnick;

public class ВторойПоМинимальностиЭлемВМассиве {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7, 3, 8};
        int secondMin = findSecondMin(array);
        System.out.println("Второй по минимальности элемент: " + secondMin);
    }

    public static int findSecondMin(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Массив должен " +
                    "содержать как минимум два элемента.");
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("В массиве нет второго " +
                    "по минимальности элемента.");
        }

        return secondMin;
    }
}
