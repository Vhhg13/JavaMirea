package ru.mirea.lab22.n2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController {
    private CalcModel model;
    private CalcView view;
    private int curOperand=0;
    CalcController(CalcModel m, CalcView v){
        model=m;
        view=v;
        for(int i=0;i<10;++i) {
            int finalI = i;
            view.addButtonListener(i, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    model.appendDigit((char) (48 + finalI));
                    view.setValue(model.getValue());
                }
            });
        }
        view.addButtonListener("/", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    model.div();
                    view.setValue(model.getValue());
            }
        });
        view.addButtonListener("*", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.mul();
                view.setValue(model.getValue());
            }
        });
        view.addButtonListener("-", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.sub();
                view.setValue(model.getValue());
            }
        });
        view.addButtonListener("+", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.add();
                view.setValue(model.getValue());
            }
        });
        view.addButtonListener("=", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.res();
                    view.setValue(model.getValue());
                }catch(ArithmeticException ex){
                    System.out.println("No div by 0");
                    model.clear();
                }
            }
        });
        view.addButtonListener(".", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    model.point();
                    view.setValue(model.getValue());
                }catch(Exception ex){
                    System.out.println("No 2 points");
                }
            }
        });
        view.setVisible(true);
    }

}
