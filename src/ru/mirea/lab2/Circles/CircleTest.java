package ru.mirea.lab2.Circles;

public class CircleTest {
    public static void main(String[] args){
        Circle c1=new Circle();
        System.out.format("Радиус первого круга - %.2f см, площадь - %.2f см^2, периметр - %.2f см\n",
                c1.getRadius(), c1.getArea(), c1.getPerimeter());

        Circle c2=new Circle(12, "Зелёный");
        System.out.format("Радиус второго круга - %.2f см, площадь - %.2f см^2, периметр - %.2f см\n",
                c2.getRadius(), c2.getArea(), c2.getPerimeter());

        Circle c3=new Circle(6);
        System.out.format("Радиус третьего круга - %.2f см, площадь - %.2f см^2, периметр - %.2f см\n",
                c3.getRadius(), c3.getArea(), c3.getPerimeter());

        switch(c2.compareTo(c3)){
            case -1:
                System.out.println("Второй круг меньше третьего");
            case 0:
                System.out.println("Второй и третий круги одинаковы по размерам");
            case 1:
                System.out.println("Второй круг больше третьего");
        }
    }
}
