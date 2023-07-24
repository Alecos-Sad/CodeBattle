package by.sadovnick;

public class БлижайшееЧислоКЗаданомуВМассиве {
    public static void main(String[] args) {
        int[] array = {10, 3, 8, 12, 6};
        int target = 7;
        int closestNumber = findClosestNumber(array, target);
        System.out.println("Ближайшее число к " + target + " в массиве: " + closestNumber);
    }

    public static int findClosestNumber(int[] array, int target) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым.");
        }

        int closestDiff = Math.abs(array[0] - target);
        int closestNumber = array[0];

        for (int i = 1; i < array.length; i++) {
            int currentDiff = Math.abs(array[i] - target);
            if (currentDiff < closestDiff) {
                closestDiff = currentDiff;
                closestNumber = array[i];
            }
        }

        return closestNumber;
    }
}
