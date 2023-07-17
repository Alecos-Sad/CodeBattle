package by.sadovnick;

import java.util.stream.Stream;

public class Ex {
    public static void main(String[] args) {
        boolean b = Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });
        System.out.println(b);
    }
}
