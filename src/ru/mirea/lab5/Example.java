package ru.mirea.lab5;

import javax.swing.*;
import java.awt.*;

public class Example {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My first GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(200, 300));
        JButton button = new JButton("Press");
        frame.getContentPane().add(button);
        JButton button1 = new JButton("Btn2");
        panel.add(button);
        panel.add(button1);
        frame.getContentPane().add(panel);
        frame.pack();

        frame.setVisible(true);
    }
}
