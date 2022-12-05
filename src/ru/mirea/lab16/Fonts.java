package ru.mirea.lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fonts {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));

        JTextArea txt = new JTextArea();
        Font font = new Font("Times new roman", Font.PLAIN, 24);
        txt.setFont(font);
        frame.add(txt);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        JButton red = new JButton("Red");
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setForeground(Color.red);
            }
        });
        JButton blue = new JButton("Blue");
        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setForeground(Color.blue);
            }
        });
        JButton black = new JButton("Black");
        black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setForeground(Color.black);
            }
        });
        panel1.add(blue);
        panel1.add(red);
        panel1.add(black);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        JButton tnr = new JButton("Times New Roman");
        tnr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setFont(new Font("Times new roman", Font.PLAIN, 24));
            }
        });
        JButton sans = new JButton("MS Sans Serif");
        sans.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 24));
            }
        });
        JButton cour = new JButton("Courier New");
        cour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setFont(new Font("Courier New", Font.PLAIN, 24));
            }
        });
        panel2.add(tnr);
        panel2.add(cour);
        panel2.add(sans);
        frame.add(panel1);
        frame.add(panel2);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
