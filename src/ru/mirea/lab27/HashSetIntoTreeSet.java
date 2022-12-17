package ru.mirea.lab27;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetIntoTreeSet {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("abc");
        hs.add("def");
        TreeSet<String> ts = new TreeSet<>(hs);
        System.out.println(ts.contains("abc"));
    }
}
