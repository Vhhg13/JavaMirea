package ru.mirea.lab24;

public class MagicChair implements Chair{
    @Override
    public String getType() {
        return "Magic Chair";
    }
    public void doMagic(){
        System.out.println("***Some magic is done***");
    }
}
