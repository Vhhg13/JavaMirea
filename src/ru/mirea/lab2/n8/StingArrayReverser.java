package ru.mirea.lab2.n8;

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
        String[] evenArr={"abc", "def", "ghi", "jkl"};
        reverse(oddArr); reverse(evenArr);
        for(String i : oddArr)
            System.out.println(i);
        System.out.println();
        for(String i : evenArr)
            System.out.println(i);
    }
}
