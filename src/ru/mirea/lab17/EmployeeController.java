package ru.mirea.lab17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeController {

    private final EmployeeView view;

    EmployeeController(){
        view = new EmployeeView();
        view.addButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Employee model=null;
                try {
                    model = new Employee(view.getName(), view.getPerHour(), view.getHours());
                    view.setResult(model.getSalary());
                }catch(NumberFormatException exc){
                    view.setResult(-1);
                }
            }
        });
        view.setVisible(true);
    }

    public static void main(String[] args) {
        new EmployeeController();
    }
}
