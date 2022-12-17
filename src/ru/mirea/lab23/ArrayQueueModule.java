package ru.mirea.lab23;

public class ArrayQueueModule {
    private static final int CAPACITY = 10;
    private static Object[] array = new Object[CAPACITY];
    private static int size = 0, head = 0, tail = 0;

    private static void ensureCapacity(int capacity) {
        if (capacity >= array.length) {
            Object[] temp = new Object[array.length * 2];
            int count = tail < head ? array.length - head : size;
            System.arraycopy(array, head, temp, 0, count);
            if (tail < head)
                System.arraycopy(array, 0, temp, count, tail);
            array = temp;
            head = 0;
            tail = size;
        }
    }

    public static void enqueue(Object element) {
        if(element != null) {
            ensureCapacity(size+1);
            ++size;
            array[tail] = element;
            tail = (tail + 1) % array.length;
        }
    }
    public static Object element() {
        if(size > 0)
            return array[head];
        return null;
    }
    public static Object dequeue() {
        if(size > 0) {
            Object result = element();
            array[head] = null;
            size--;
            head = (head + 1) % array.length;
            return result;
        }
        return null;
    }
    public static Object peek() {
        if(size > 0)
            return array[(tail == 0) ? array.length - 1 : tail - 1];
        return null;
    }


    public static int getSize() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        size = head = tail = 0;
        array = new Object[CAPACITY];
    }
    public static Object[] toArray() {
        Object[] temp = new Object[size];
        int count = tail < head ? array.length - head : size;
        System.arraycopy(array, head, temp, 0, count);
        if (tail < head)
            System.arraycopy(array, 0, temp, count, tail);
        return temp;
    }
}

