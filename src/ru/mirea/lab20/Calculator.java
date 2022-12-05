package ru.mirea.lab20;

public class Calculator {
    public static <N, T> double add(N a, T b){
        return (double)a+(double)b;
    }
    public static <T, N> double sub(T a, N b){
        return (double)a-(double)b;
    }
    public static <T, N> double mul(T a, N b){
        return (double)a*(double) b;
    }
    public static <T, N> double div(T a, N b){
        double res = (double)a/(double)b;
        if(Double.isFinite(res)) return res;
        else throw new ArithmeticException("Division by zero");
    }
    public static void main(String[] args) {
        System.out.println(Calculator.add(1, 2.4));
        System.out.println(Calculator.sub(2.2, -3));
        System.out.println(Calculator.mul(4, 9.8));
        System.out.println(Calculator.div(5, 3.4));
    }
}
