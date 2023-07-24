package by.sadovnick;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class РеализацияОчереди {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        LinkedList<Integer> queue1 = new LinkedList<>();
        queue1.offer(1);
        queue1.offer(2);
        queue1.offer(3);
        while (!queue1.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
