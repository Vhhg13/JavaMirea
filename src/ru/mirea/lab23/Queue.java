package ru.mirea.lab23;

public interface Queue {
    public Object dequeue();
    public void enqueue(Object o);
    public Object element();
    public int getSize();
    public boolean isEmpty();
    public void clear();
}
