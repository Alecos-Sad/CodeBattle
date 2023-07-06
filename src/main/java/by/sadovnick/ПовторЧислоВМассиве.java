package by.sadovnick;

public class ПовторЧислоВМассиве {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 7, 8, 9}; // исходный массив

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Повторяющаяся цифра: " + arr[i]);
                    return;
                }
            }
        }
        System.out.println("Повторяющейся цифры в массиве нет.");
    }
}

//public class DoubleDigitInMassive {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 6, 7, 8, 9}; // исходный массив
//
//        HashSet<Integer> set = new HashSet<>();
//
//        for (int num : arr) {
//            if (set.contains(num)) {
//                System.out.println("Повторяющаяся цифра: " + num);
//                return;
//            }
//            set.add(num);
//        }
//
//        System.out.println("Повторяющейся цифры в массиве нет.");
//    }
//}
