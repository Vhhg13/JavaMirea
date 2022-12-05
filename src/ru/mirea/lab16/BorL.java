package ru.mirea.lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BorL {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout");
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
        JPanel panel = new JPanel();
        JLabel txt = new JLabel("Center");
        txt.setAlignmentX(Component.CENTER_ALIGNMENT);
        frame.add(txt);
        frame.add(panel);
        txt.setSize(50, 50);
        panel.setLayout(new BorderLayout());
        frame.setSize(100, 100);
        Button[] buttons = new Button[5];
        String[] pos = new String[5];
        pos[0]="North";
        pos[1]="West";
        pos[2]="Center";
        pos[3]="East";
        pos[4]="South";

        buttons[0]=new Button("САО");
        buttons[1]=new Button("ЗАО");
        buttons[2]=new Button("ЦАО");
        buttons[3]=new Button("ВАО");
        buttons[4]=new Button("ЮАО");

        for (int i = 0; i < 5; i++) {
            int finalI = i;
            buttons[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    txt.setText("Добро пожаловать в "+buttons[finalI].getLabel());
                }
            });
            panel.add(buttons[i], pos[i]);
        }
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
