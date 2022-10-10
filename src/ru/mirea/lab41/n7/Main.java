package ru.mirea.lab41.n7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Random rnd = new Random();
        for(int i=0;i<5;++i)
            if(rnd.nextInt()%2==0)
                students[i] = new UniversityStudent();
            else
                students[i] = new SchoolStudent();
        for(int i=0;i<5;++i)
            if(students[i].getClass() == SchoolStudent.class)
                System.out.printf("По индексу %d находится школьник\n", i);
        System.out.println();
        for(int i=0;i<5;++i)
            if(students[i].getClass() == UniversityStudent.class)
                System.out.printf("По индексу %d находится студент\n", i);
    }
}
