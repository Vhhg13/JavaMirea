package ru.mirea.lab13;

public class Person {
    private String FName, MidName, LName;

    public Person(String FName, String midName, String LName) {
        this.FName = FName;
        MidName = midName;
        this.LName = LName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public void setMidName(String midName) {
        MidName = midName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }
    public String getFullName(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(FName);
        if(MidName!=null) stringBuilder.append(MidName);
        if(LName!=null) stringBuilder.append(LName);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

    }
}
