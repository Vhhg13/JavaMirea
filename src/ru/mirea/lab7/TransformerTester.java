package ru.mirea.lab7;

public class TransformerTester{
    public static void main(String[] args) {
        System.out.println("abcdef reversed: " + StringTransformer.reverse("abcdef"));
        System.out.println("12345678910 has "+StringTransformer.countChars("12345678910")+" chars");
        System.out.println(StringTransformer.fromOdds("0123456789"));
    }
}
