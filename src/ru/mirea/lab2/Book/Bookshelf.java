package ru.mirea.lab2.Book;

public class Bookshelf {
    private int numOfBooks;
    private Book[] books;

    public Bookshelf(String[] authors, String[] names, int[] years){
        numOfBooks=names.length;
        books=new Book[numOfBooks];
        for(int i=0;i<numOfBooks;++i)
            books[i]=new Book(authors[i], names[i], years[i]);
    }

    public Book getNewestBook(){
        int max=0;
        Book newestBook=null;
        for(Book i : books){
            if(i.getYear()>max){
                max=i.getYear();
                newestBook=i;
            }
        }
        return newestBook;
    }

    public Book getOldestBook(){
        int min=9999;
        Book oldestBook=null;
        for(Book i : books){
            if(i.getYear()<min){
                min=i.getYear();
                oldestBook=i;
            }
        }
        return oldestBook;
    }
    public static void sortBooksByYear(Bookshelf bs){
        boolean swapd=true;
        while(swapd){
            swapd=false;
            for(int i=0;i<bs.numOfBooks-1;++i){
                if(bs.books[i].getYear()>bs.books[i+1].getYear()){
                    Book tmp=bs.books[i];
                    bs.books[i]=bs.books[i+1];
                    bs.books[i+1]=tmp;
                    swapd=true;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] names={"Преступление и наказание", "Капитанская Дочка", "Герой нашего времени"};
        String[] authors={"Достоевский Фёдор Михайлович", "Пушкин Александр Сергеевич", "Лермонтов Михаил Юрьевич"};
        int[] years={1866, 1836, 1840};
        Bookshelf bookshelf=new Bookshelf(authors, names, years);
        System.out.println(bookshelf.getOldestBook());
        System.out.println(bookshelf.getNewestBook());
        System.out.println();
        sortBooksByYear(bookshelf);
        for(Book i : bookshelf.books){
            System.out.println(i);
        }
    }
}