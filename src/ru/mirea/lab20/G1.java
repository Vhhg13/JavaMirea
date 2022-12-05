package ru.mirea.lab20;

import java.io.Serializable;

public class G1<T extends Comparable<T>, V extends Serializable, K> {
    T t;
    V v;
    K k;

    public G1(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }
    public void printClasses(){
        System.out.println(t.getClass());
        System.out.println(v.getClass());
        System.out.println(k.getClass());
    }

    public static void main(String[] args) {
        new G1("str", 1, 1.2).printClasses();

    }
}
