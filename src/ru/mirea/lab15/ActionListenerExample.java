package ru.mirea.lab15;

import java.awt.*;
import java.awt.event.*;
public class ActionListenerExample {
    public static void main(String[] args) {
        Frame f=new Frame("ActionListener Example");
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Font font = new Font("Ubuntu mono", Font.PLAIN, 30);
        final TextField tf=new TextField();
        tf.setBounds(10,50, 210,40);
        tf.setFont(font);
        Button b=new Button("Click Here");
        Button plus=new Button("+");
        Button sub=new Button("-");
        Button mul=new Button("*");
        Button div=new Button("/");
        plus.setBounds(10,100,60,30);
        plus.setSize(100,50);
        sub.setBounds(120,100,60,30);
        sub.setSize(100,50);
        mul.setBounds(10,160,60,30);
        mul.setSize(100,50);
        div.setBounds(120,160,60,30);
        div.setSize(100,50);
        plus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    //tf.setText("Добро пожаловать в мир Джава.");
                    String[] txt = tf.getText().split(" ");
                    int res=0;
                    for(String s : txt){
                        res+=Integer.parseInt(s);
                    }
                    tf.setText(String.valueOf(res));
                }catch(Exception ex){
                    System.out.println("Illegal input");
                }
            }
        });
        sub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    String[] txt = tf.getText().split(" ");
                    int res=Integer.parseInt(txt[0])*2;
                    for(String s : txt){
                        res-=Integer.parseInt(s);
                    }
                    tf.setText(String.valueOf(res));
                }catch(Exception ex){
                    System.out.println("Illegal input");
                }
            }
        });
        mul.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    String[] txt = tf.getText().split(" ");
                    int res=1;
                    for(String s : txt){
                        res*=Integer.parseInt(s);
                    }
                    tf.setText(String.valueOf(res));
                }catch(Exception ex){
                    System.out.println("Illegal input");
                }
            }
        });
        div.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    String[] txt = tf.getText().split(" ");
                    int res=(int)Math.pow(Integer.parseInt(txt[0]), 2);
                    for(String s : txt){
                        res/=Integer.parseInt(s);
                    }
                    tf.setText(String.valueOf(res));
                }catch(Exception ex){
                    System.out.println("Illegal input");
                }
            }
        });
        f.add(plus);
        f.add(mul);
        f.add(div);
        f.add(sub);
        f.add(tf);
        f.setSize(230,220);
        f.setLayout(null);
        f.setVisible(true);
    }
}