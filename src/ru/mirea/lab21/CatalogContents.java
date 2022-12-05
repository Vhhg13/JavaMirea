package ru.mirea.lab21;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class CatalogContents {
    public static void main(String[] args) {
        File file = new File("/home/vhhg/");
        List<File> list = new LinkedList<>();
        for(File f : file.listFiles()){
            list.add(f);
        }
        for(int i=0;i<5;++i) {
            System.out.println(list.get(i));
        }
    }
}
