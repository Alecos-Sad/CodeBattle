package by.sadovnick;

import java.util.List;

public class КолиПовторВМассивеЧисла {
    public static void main(String[] args) {
        List<Integer> massive = List.of(1, 2, 3, 4, 4);
        int count = 0;
        for (int i = 0; i < massive.size(); i++) {
            for (int j = i + 1; j < massive.size(); j++) {
                if (massive.get(j).equals(massive.get(i))) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
