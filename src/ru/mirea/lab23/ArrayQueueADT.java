package ru.mirea.lab23;

public class ArrayQueueADT {
    private static final int CAPACITY = 10;
    private Object[] array = new Object[CAPACITY];
    private int size=0, head=0, tail=0;
    private static void ensureCapacity(ArrayQueueADT adt, int capacity) {
        if (capacity >= adt.array.length) {
            Object[] temp = new Object[adt.array.length*2];
            int count = adt.tail < adt.head ? adt.array.length - adt.head : adt.size;
            System.arraycopy(adt.array, adt.head, temp, 0, count);
            if (adt.tail < adt.head)
                System.arraycopy(adt.array, 0, temp, count, adt.tail);
            adt.array = temp;
            adt.head = 0;
            adt.tail = adt.size;
        }
    }

    public static void enqueue(ArrayQueueADT adt, Object element) {
        if(element != null) {
            ensureCapacity(adt, adt.size + 1);
            adt.array[adt.tail] = element;
            adt.tail = (adt.tail + 1) % adt.array.length;
            adt.size++;
        }
    }

    public static Object element(ArrayQueueADT adt) {
        if(adt.size > 0)
            return adt.array[adt.head];
        return null;
    }

    public static Object dequeue(ArrayQueueADT adt) {
        if(adt.size > 0) {
            Object result = element(adt);
            adt.array[adt.head] = null;
            adt.size--;
            adt.head = (adt.head + 1) % adt.array.length;
            return result;
        }
        return null;
    }

    public static int size(ArrayQueueADT adt) {
        return adt.size;
    }

    public static boolean isEmpty(ArrayQueueADT adt) {
        return adt.size == 0;
    }

    public static void clear(ArrayQueueADT adt) {
        adt.size = adt.head = adt.tail = 0;
        adt.array = new Object[CAPACITY];
    }

    public static Object[] toArray(ArrayQueueADT adt) {
        Object[] temp = new Object[adt.size];
        int count = adt.tail < adt.head ? adt.array.length - adt.head : adt.size;
        System.arraycopy(adt.array, adt.head, temp, 0, count);
        if (adt.tail < adt.head)
            System.arraycopy(adt.array, 0, temp, count, adt.tail);
        return temp;
    }
}
