package ru.mirea.lab6.n69;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[5];
        printables[0] = new Book("Жили были дед да бабка");
        printables[1] = new Magazine("И была у них курочка ряба");
        printables[2] = new Book("Снесла курочка яичко");
        printables[3] = new Magazine("Не простое - золотое");
        printables[4] = new Book("Яичко упало и разбилось");

        for(Printable p : printables)
            p.print();
    }
}
