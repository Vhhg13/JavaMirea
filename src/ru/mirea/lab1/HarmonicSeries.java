package ru.mirea.lab1;

public class HarmonicSeries {
    public static double nthHarmonic(int n){
        double res=0;
        for(int k=1;k<=n;++k)
            res+=1.0/k;
        return res;
    }
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++)
            System.out.format("H%d\t=\t%f\n", i, nthHarmonic(i));
    }
}
