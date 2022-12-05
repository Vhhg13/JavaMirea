package ru.mirea.lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ugadayka extends JFrame {
    Ugadayka(){
        super("Угадайка");
        int num=(int)(Math.random()*20);
        int[] numOfGuesses={3};
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        JTextArea jTextArea = new JTextArea(1, 10);
        JButton button = new JButton("Guess");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int guess = Integer.parseInt(jTextArea.getText());
                    if (guess == num) {
                        jTextArea.setText("Верно! Это число " + num);
                    } else if (guess > num) {
                        jTextArea.setText("Меньше");
                    } else if (guess < num) {
                        jTextArea.setText("Больше");
                    }
                    if(numOfGuesses[0]==0)
                        jTextArea.setText("У вас кончились попытки");
                    else
                        --numOfGuesses[0];
                }catch(Exception ex){
                    jTextArea.setText("Неправильный ввод");
                }
            }
        });
        add(jTextArea);
        add(button);
        setSize(160,100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Ugadayka();
    }
}
