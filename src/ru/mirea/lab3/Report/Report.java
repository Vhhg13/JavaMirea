package ru.mirea.lab3.Report;

public class Report {
    public static String generateReport(Employee[] employees){
        StringBuilder res= new StringBuilder("%-20s %10s%n".formatted("Employee", "Salary"));
        for(int i=0;i<employees.length-1;++i)
            res.append(employees[i]).append("\n");
        res.append(employees[employees.length-1]);
        return res.toString();
    }

    public static void main(String[] args) {
        Employee[] employees=new Employee[5];
        employees[0]=new Employee("Petrov", 12000);
        employees[1]=new Employee("Ivanov", 13000);
        employees[2]=new Employee("Popov", 2000);
        employees[3]=new Employee("Sidorov", 30000);
        employees[4]=new Employee("Mikhailov", 18000);
        System.out.println(generateReport(employees));
    }
}
