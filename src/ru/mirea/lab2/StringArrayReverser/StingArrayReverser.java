package ru.mirea.lab2.StringArrayReverser;

public class StingArrayReverser {
    static void reverse(String[] str){
        int len=str.length;
        for(int i=0;i<len/2;++i){
            String tmp;
            tmp=str[i];
            str[i]=str[len-1-i];
            str[len-1-i]=tmp;
        }
    }

    public static void main(String[] args) {
        String[] oddArr={"abc", "def", "ghi", "jkl", "mno"};
        System.out.println("До:");
        for(String i : oddArr)
            System.out.print(i+" ");
        System.out.println();
        reverse(oddArr);
        System.out.println("После:");
        for(String i : oddArr)
            System.out.print(i+" ");

//        String[] evenArr={"abc", "def", "ghi", "jkl"};
//        reverse(evenArr);
//
//
//        System.out.println();
//        System.out.println();
//        for(String i : evenArr)
//            System.out.print(i+" ");
    }
}
