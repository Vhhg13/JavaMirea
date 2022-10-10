package ru.mirea.lab5.n2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main extends Canvas {
    Shape[] shapes = new Shape[20];
    public Main (){
        Random rnd = new Random();
        for(int i=0;i<20;++i){
            int clr=rnd.nextInt(1, 7);
            Color color;
            switch (clr) {
                case 1 -> color = Color.red;
                case 2 -> color = Color.orange;
                case 3 -> color = Color.yellow;
                case 4 -> color = Color.green;
                case 5 -> color = Color.blue;
                case 6 -> color = Color.pink;
                default -> color = Color.black;
            }
            int shp=rnd.nextInt(1,5);

            switch (shp){
                case 1, 4 -> shapes[i]=new Circle(color, rnd.nextInt(20, 400), rnd.nextInt(20, 400), rnd.nextInt(10, 100));
                case 2 -> shapes[i]=new Square(color, rnd.nextInt(20, 400), rnd.nextInt(20, 400), rnd.nextInt(10, 100));
                case 3 -> shapes[i]=new Rectangle(color, rnd.nextInt(20, 400), rnd.nextInt(20, 400), rnd.nextInt(10, 100), rnd.nextInt(10, 100));
            }

        }
    }

    private void amogus(Graphics g){
        g.setColor(Color.black);
        g.drawOval(365, 335, 60, 60);
        g.drawRect(365, 365, 60, 50);
        g.drawRect(365, 415, 25, 12);
        g.drawRect(400, 415, 25, 12);

        g.setColor(Color.red);
        g.fillRect(365, 365, 60, 50);
        g.fillOval(365, 335, 60, 60);


        //ноги
        g.setColor(Color.black);

        g.drawOval(365, 421, 25, 10);
        g.drawOval(400, 421, 25, 10);

        g.setColor(Color.red);
        g.fillOval(365, 421, 25, 10);
        g.fillOval(400, 421, 25, 10);



        g.fillRect(365, 415, 25, 12);
        g.fillRect(400, 415, 25, 12);



        // Рюкзак
        g.setColor(Color.black);
        g.drawOval(426, 370, 12, 40);
        g.drawRect(425, 370, 8, 40);
        g.setColor(Color.red);
        g.fillOval(426, 370, 12, 40);
        g.fillRect(425, 370, 8, 40);


        g.setColor(Color.black);
        g.drawOval(350, 350, 50, 25);
        g.setColor(Color.blue);
        g.fillOval(350, 350, 50, 25);
    }

    @Override
    public void paint(Graphics g) {
        for(Shape shape : shapes)
            shape.draw(g);
        amogus(g);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Main main = new Main();
        frame.add(main);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
