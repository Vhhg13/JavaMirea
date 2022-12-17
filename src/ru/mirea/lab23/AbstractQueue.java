package ru.mirea.lab23;

public abstract class AbstractQueue implements Queue{
    protected int size;
    public AbstractQueue(){
        size=0;
    }
    public AbstractQueue(int sz){
        size=sz;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int getSize(){
        return size;
    }
}
