package ru.mirea.lab6.n69;

public class Magazine implements Printable{
    private final String magazineText;

    public Magazine(String magazineText) {
        this.magazineText = magazineText;
    }

    @Override
    public void print() {
        System.out.println(magazineText);
    }
}
