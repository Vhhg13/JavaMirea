package ru.mirea.lab7;
/*
Разработайте интерфейс MathCalculable, который содержит
66объявления математических функций: возведения в степень и модуль
комплексного числа, также содержит число PI. Напишите класс MathFunc,
который реализует, реализует этот интерфейс. Например, вычисления длины
окружности, для чего используйте число PI из интерфейса. Протестируйте
класс
 */

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
        System.out.println("1^100 = "+mc.pow(1, 100));
        System.out.println("1.1^20 = "+mc.pow(1.1, 20));
        System.out.println("|1| = "+mc.getAbs(1, 0));
        System.out.println("|3+4i| = "+mc.getAbs(3, 4));
    }
}
