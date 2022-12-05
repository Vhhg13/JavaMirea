package ru.mirea.lab13;

import java.util.StringTokenizer;

public class Shirt {
    String num, type, color, size;

    public Shirt(String num, String type, String color, String size) {
        this.num = num;
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public static Shirt asShirt(String str){
        StringTokenizer st = new StringTokenizer(str, ",");
        return new Shirt(st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken());
    }
    public static Shirt[] stringsToShirts(String[] strings){
        Shirt[] shirts = new Shirt[11];
        for(int i=0;i<11;++i)
            shirts[i]=asShirt(strings[i]);
        return shirts;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "num='" + num + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] shirts1 = stringsToShirts(shirts);
        for(Shirt s : shirts1)
            System.out.println(s);
    }
}
