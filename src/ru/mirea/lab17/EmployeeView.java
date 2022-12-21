package ru.mirea.lab17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class EmployeeView extends JFrame {

    private final JLabel res;
    private final JTextField name;
    private final JTextField hours;
    private final JTextField perHour;
    private final JButton btn;

    EmployeeView(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setPreferredSize(new Dimension(300, 300));
        setSize(new Dimension(500,300));
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(new JLabel("Name:"));
        name = new JTextField(30);
        panel1.add(name);
        getContentPane().add(panel1);


        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(new JLabel("Hours Worked:"));
        hours = new JTextField(25);
        panel2.add(hours);
        getContentPane().add(panel2);


        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());
        panel3.add(new JLabel("Salary per hour:"));
        perHour = new JTextField(25);
        panel3.add(perHour);
        getContentPane().add(panel3);

        JPanel panel4 = new JPanel();
        btn = new JButton("Submit");
        add(panel4);
        panel4.add(btn);

        JPanel panel5 = new JPanel();
        res = new JLabel("");
        add(panel5);
        panel5.add(res);
    }
    public void addButtonListener(ActionListener l){
        btn.addActionListener(l);
    }

    public String getName(){
        return name.getText();
    }
    public int getHours(){
        return Integer.parseInt(hours.getText());
    }
    public double getPerHour(){
        return Double.parseDouble(perHour.getText());
    }
    public void setResult(double result){
        if(result<0) res.setText("Wrong data");
        else res.setText(name.getText() + "'s salary is " + result);
    }
}
