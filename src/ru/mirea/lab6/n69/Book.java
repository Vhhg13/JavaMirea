package ru.mirea.lab6.n69;

public class Book implements Printable{
    private String bookText;

    public Book(String bookText) {
        this.bookText = bookText;
    }

    @Override
    public void print() {
        System.out.println(bookText);
    }
}
