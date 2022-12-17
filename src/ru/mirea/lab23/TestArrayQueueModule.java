package ru.mirea.lab23;

public class TestArrayQueueModule {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ArrayQueueModule.enqueue(i);
        }
        while (!(ArrayQueueModule.isEmpty())) {
            System.out.println(ArrayQueueModule.getSize() + " " + ArrayQueueModule.element() + " " + ArrayQueueModule.dequeue());
        }
        for (int i = 0; i < 10; i++) {
            ArrayQueueModule.enqueue(i);
        }
        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.isEmpty());
        for (int i = 0; i < 10; i++) {
            ArrayQueueModule.enqueue(i);
        }
        Object[] arr = ArrayQueueModule.toArray();
        for (Object o : arr) {
            System.out.print(o + " ");
        }
    }
}
