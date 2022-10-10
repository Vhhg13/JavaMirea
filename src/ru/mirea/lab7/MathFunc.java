package ru.mirea.lab7;

public class MathFunc implements MathCalculable{
    @Override
    public double pow(double n, int pow) {
        double res=1;
        for(int i=0;i<pow;++i)
            res*=n;
        return res;
    }

    @Override
    public double getAbs(double a, double b) {
        return Math.sqrt(a*a+b*b);
    }

    public static void main(String[] args) {
        MathCalculable mc = new MathFunc();
        System.out.println(mc.pow(1, 100));
        System.out.println(mc.pow(1.1, 20));
        System.out.println(mc.getAbs(1, 0));
        System.out.println(mc.getAbs(3, 4));
    }
}
