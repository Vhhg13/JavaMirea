package ru.mirea.lab11;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class ListsTest {
    private static Integer NUM = 1_000_000;
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Date start;
        Date end;

        start = new Date();
        for(int i=0;i<NUM;++i){
            linkedList.add(i);
        }
        end = new Date();
        System.out.println("LinkedList справился за: "+(end.getTime()- start.getTime())+"мc");

        start = new Date();
        for(int i=0;i<NUM;++i){
            arrayList.add(i);
        }
        end = new Date();
        System.out.println("ArrayList справился за: "+(end.getTime()- start.getTime())+"мc");
    }
}
