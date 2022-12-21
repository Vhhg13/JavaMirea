package ru.mirea.lab26;

public class HTTest {
    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.hashtabAdd(3, 9);
        System.out.println("+(3, 9)");
        ht.hashtabAdd(5, 25);
        System.out.println("+(5, 25)");
        ht.hashtabAdd(8, 64);
        System.out.println("+(8, 64)");
        System.out.print("ht(3)=");
        System.out.println(ht.hashtabLookup(3));
        System.out.print("ht(8)=");
        System.out.println(ht.hashtabLookup(8));
        System.out.println("-(3)");
        ht.hashtabDelete(3);
        System.out.print("ht(3)=");
        System.out.println(ht.hashtabLookup(3));
    }
}
