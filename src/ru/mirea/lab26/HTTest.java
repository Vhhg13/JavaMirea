package ru.mirea.lab26;

public class HTTest {
    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.hashtabAdd(3, 9);
        ht.hashtabAdd(5, 25);
        ht.hashtabAdd(8, 64);
        System.out.println(ht.hashtabLookup(3));
        System.out.println(ht.hashtabLookup(8));
        ht.hashtabDelete(3);
        System.out.println(ht.hashtabLookup(3));
    }
}
