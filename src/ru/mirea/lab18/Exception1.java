package ru.mirea.lab18;

public class Exception1 {
    public void excDemo(){
        System.out.println(2/0); //1
//        System.out.println(2.0/0.0); //2
    }

    //3:
//    public void excDemo() {
//        try{
//            System.out.println(2/0);
//        }catch(Exception e){
//            System.out.println("На ноль делить нельзя!!!");
//        }
//    }



    public static void main(String[] args) {
        new Exception1().excDemo();
    }
}
