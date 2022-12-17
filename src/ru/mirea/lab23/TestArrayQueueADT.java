package ru.mirea.lab23;

public class TestArrayQueueADT {
    public static void main(String[] args) {
        ArrayQueueADT queue = new ArrayQueueADT();
        for (int i = 0; i < 10; i++) {
            ArrayQueueADT.enqueue(queue, i);
        }
        while (!ArrayQueueADT.isEmpty(queue)) {
            System.out.println(ArrayQueueADT.size(queue) + " " + ArrayQueueADT.element(queue) + " " + ArrayQueueADT.dequeue(queue));
        }

        for (int i = 0; i < 10; i++) {
            ArrayQueueADT.enqueue(queue, i);
        }
        ArrayQueueADT.clear(queue);
        System.out.println(ArrayQueueADT.isEmpty(queue));

        for (int i = 0; i < 10; i++) {
            ArrayQueueADT.enqueue(queue, i);
        }
        Object[] array = ArrayQueueADT.toArray(queue);
        for(Object o : array)
            System.out.println(o);
    }
}
