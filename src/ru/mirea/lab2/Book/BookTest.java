package ru.mirea.lab2.Book;

public class BookTest {
    public static void main(String[] args){
        Book b1=new Book("Ревизор", "Достоевский Фёдор Михайлович", 1866);
        Book b2=new Book("Капитанская Дочка", "Донцова Дарья Аркадьевна", 1836);
        Book b3=new Book("Герой нашего времени", "Лермонтов Михаил Юрьевич", 2021);

        b1.setName("Преступление и наказание");
        b2.setAuthor("Пушкин Александр Сергеевич");
        b3.setYear(1840);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
