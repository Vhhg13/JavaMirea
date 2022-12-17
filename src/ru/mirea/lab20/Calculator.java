package ru.mirea.lab20;

public class Calculator {
    public static <N extends Number, T extends Number> double add(N a, T b){
        return a.doubleValue()+b.doubleValue();
    }
    public static <T extends Number, N extends Number> double sub(T a, N b){
        return a.doubleValue()-b.doubleValue();
    }
    public static <T extends Number, N extends Number> double mul(T a, N b){
        return a.doubleValue()*b.doubleValue();
    }
    public static <T extends Number, N extends Number> double div(T a, N b){
        double res = a.doubleValue()/(double)b;
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
