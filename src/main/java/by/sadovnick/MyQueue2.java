package by.sadovnick;

import java.util.ArrayDeque;

public class MyQueue2<T> {
    private ArrayDeque<T> queue;

    public MyQueue2() {
        queue = new ArrayDeque<>();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    // Вставить элемент в конец очереди
    public void enqueue(T element) {
        queue.offer(element);
    }

    // Забрать и удалить элемент из начала очереди
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return queue.poll();
    }

    // Удалить элемент из очереди (если он присутствует)
    public boolean remove(T element) {
        return queue.remove(element);
    }

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
