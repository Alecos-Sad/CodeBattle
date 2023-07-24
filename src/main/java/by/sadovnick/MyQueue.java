package by.sadovnick;

public class MyQueue<T> {
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> front; // Начало очереди
    private Node<T> rear; // Конец очереди
    private int size;

    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    // Вставить элемент в конец очереди
    public void enqueue(T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Забрать и удалить элемент из начала очереди
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        T data = front.data;
        front = front.next;
        size--;
        return data;
    }

    // Удалить элемент из очереди (если он присутствует)
    public boolean remove(T element) {
        if (isEmpty()) {
            return false;
        }

        if (front.data.equals(element)) {
            front = front.next;
            size--;
            return true;
        }

        Node<T> current = front;
        Node<T> prev = null;

        while (current != null && !current.data.equals(element)) {
            prev = current;
            current = current.next;
        }

        if (current != null) {
            prev.next = current.next;
            size--;
            return true;
        }

        return false;
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
