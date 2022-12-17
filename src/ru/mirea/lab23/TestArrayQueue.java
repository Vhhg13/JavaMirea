package ru.mirea.lab23;

public class TestArrayQueue {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();

        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.getSize() + " " + queue.element() + " " + queue.dequeue());
        }

        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        queue.clear();
        System.out.println("Queue must be empty. Is it? " + queue.isEmpty());


        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        Object[] arr = queue.toArray();
        for (Object o : arr) {
            System.out.print(o);
        }
    }
}
