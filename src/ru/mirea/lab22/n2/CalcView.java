package ru.mirea.lab22.n2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalcView extends JFrame {

    private final JPanel screen;
    private final JLabel value;
    private final JPanel buttonViews;
    private final Button[] buttons = new Button[16];
    private static int numAt(int i, int j){
        return Math.abs(7-(i*4)+(i%2))+j;
    }

    CalcView(){
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        screen = new JPanel(new GridLayout(1, 1));
        setPreferredSize(new Dimension(800, 800));

        value = new JLabel();
        value.setFont(new Font("Arial", Font.PLAIN, 100));
        //value.setPreferredSize(new Dimension(800, 10));
        screen.setPreferredSize(new Dimension(800, 10));
        screen.add(value);

        buttonViews = new JPanel(new GridLayout(4, 4));
        buttonViews.setSize(300, 500);
        String[] ops = { "/", "*", "-"};
        for(int i=0;i<3;++i){
            for(int j=0;j<3;++j){
                buttons[numAt(i, j)]=new Button(Integer.toString(numAt(i, j)));
                buttonViews.add(buttons[numAt(i, j)]);
            }
            buttons[10+i]=new Button(ops[i]);
            buttonViews.add(buttons[10+i]);
        }
        buttons[0]=new Button("0");
        buttonViews.add(buttons[0]);

        buttons[13]=new Button(".");
        buttonViews.add(buttons[13]);

        buttons[14]=new Button("+");
        buttonViews.add(buttons[14]);

        buttons[15]=new Button("=");
        buttonViews.add(buttons[15]);
        add(screen);
        add(buttonViews);

        pack();
    }

    public void addButtonListener(int num, ActionListener l){
        buttons[num].addActionListener(l);
    }
    public void addButtonListener(String op, ActionListener l){
        buttons[switch(op){
            case "/" -> 10;
            case "*" -> 11;
            case "-" -> 12;
            case "." -> 13;
            case "+" -> 14;
            //case "=" -> 15;
            default -> 15;
        }].addActionListener(l);
    }

    public void setValue(String val){
        value.setText(val);
    }
}
