package ru.mirea.lab25;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(([0-9]{1,2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]{1,2}|1[0-9]{2}|2[0-5][0-9]|25[0-5])");
        Random rnd = new Random();
        int bound=256;
        int i=0;
        for(;i<1000;++i){
            StringBuilder sb = new StringBuilder(20);
            sb.append(rnd.nextInt(0, bound));
            sb.append('.');
            sb.append(rnd.nextInt(0, bound));
            sb.append('.');
            sb.append(rnd.nextInt(0, bound));
            sb.append('.');
            sb.append(rnd.nextInt(0, bound));
            Matcher matcher = pattern.matcher(sb.toString());
            if(!matcher.matches()){
                System.out.println(sb + " must match, but it doesn't");
                break;
            }
        }
        if(i==1000) System.out.println("Regexp tests passed");
        for(int j=0;j<1000;++j) {
            StringBuilder sb = new StringBuilder(10);
            for (i = 0; i < 10; ++i)
                sb.append(rnd.nextInt(0, 2) == 0 ? '(' : ')');
            if(checkParens(sb.toString()))
                System.out.println(sb);
        }
    }
    public static boolean checkParens(String str){
        int open=0;
        for(int i=0;i<str.length();++i){
            if(str.charAt(i)=='(') open++;
            else if(str.charAt(i)==')' && open>0) open--;
            else if(str.charAt(i)==')') return false;
        }
        return open==0;
    }
}
