package ru.mirea.lab24;

public class MultifunctionalChair implements Chair{
    @Override
    public String getType() {
        return "Magic Chair";
    }
    public int sum(int a, int b){
        return a+b;
    }
}
