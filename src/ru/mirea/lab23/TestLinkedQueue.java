package ru.mirea.lab23;

public class TestLinkedQueue {
    public static void main(String[] args) {
        LinkedQueue q = new LinkedQueue();
        for(int i=0;i<10;++i)
            q.enqueue(i);
        for(int i=0;i<8;++i)
            System.out.println(q.dequeue());
        for(int i=0;i<10;++i)
            q.enqueue(i*2);
        for(int i=0;i<12;++i)
            System.out.println(q.dequeue());
    }
}
