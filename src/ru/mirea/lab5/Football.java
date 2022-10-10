package ru.mirea.lab5;

import com.sun.jdi.request.MonitorContendedEnteredRequest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Football {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Winner: DRAW");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 1));
        panel.setPreferredSize(new Dimension(250,300));
        frame.getContentPane().add(panel);

        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");




        JLabel label1 = new JLabel("Result: 0X0", JLabel.CENTER);
        JLabel label2 = new JLabel("Last Scorer: N/A", JLabel.CENTER);

        final int[] milan = {0};
        final int[] madrid = {0};
        String lastScorer="";
        String l1Format="Result: %dX%d";
        String l2Format="Last Scorer: %s";

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++milan[0];
                label1.setText("Result: "+milan[0]+"X"+madrid[0]);
                label2.setText("Last Scorer: " + "AC Milan");
                if(milan[0]>madrid[0])
                    frame.setTitle("Winner: " + "AC Milan");
                else if(madrid[0]>milan[0])
                    frame.setTitle("Winner: " + "Real Madrid");
                else
                    frame.setTitle("Winner: " + "DRAW");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++madrid[0];
                label1.setText("Result: "+milan[0]+"X"+madrid[0]);
                label2.setText("Last Scorer: " + "Real Madrid");
                if(milan[0]>madrid[0])
                    frame.setTitle("Winner: " + "AC Milan");
                else if(madrid[0]>milan[0])
                    frame.setTitle("Winner: " + "Real Madrid");
                else
                    frame.setTitle("Winner: " + "DRAW");
            }
        });


        Font myFont = new Font("Dialog", Font.BOLD, 16);
        button1.setFont(myFont);
        button2.setFont(myFont);
        label1.setFont(myFont);
        label2.setFont(myFont);

        panel.add(button1);
        panel.add(button2);
        panel.add(label1);
        panel.add(label2);
        frame.pack();
        frame.setVisible(true);
    }
}
