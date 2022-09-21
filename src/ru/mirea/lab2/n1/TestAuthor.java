package ru.mirea.lab2.n1;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Lev Tolstoy", "lev_tolstoy@yandex.ru", 'M');
        System.out.println(a1);
        a1.setEmail("tolstoy_lev@yandex.ru");
        System.out.println(a1);
    }
}
