package ru.mirea.lab22.n1;

import java.text.ParseException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RPNCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение");
        String expr = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(expr, " ");
        Stack<Double> stack = new Stack();
        while(st.hasMoreTokens()){
            String token=st.nextToken();
            double num;
            try{
                num = Double.parseDouble(token);
                stack.push(num);
            }catch(NumberFormatException e){
                double o1, o2;
                try {
                    o2 = stack.pop();
                    o1 = stack.pop();
                    if(o2==0) throw new ArithmeticException();
                    stack.push(
                            switch (token) {
                                case "+" -> o1 + o2;
                                case "-" -> o1 - o2;
                                case "/" -> o1 / o2;
                                default -> o1 * o2;
                            }
                    );
                }catch(ArithmeticException divby0){
                    System.out.println("Can not divide by 0");
                    break;
                }catch(Exception ex){
                    System.out.println("Stack underflow");
                    break;
                }
            }
        }
        stack.print();
    }
}
