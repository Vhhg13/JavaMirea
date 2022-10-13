package ru.mirea.lab10;

import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Comparator<Student10> cmp = Comparator.comparing(Student10::getSpeciality).reversed();
        Student10 student1 = new Student10("FirstName1", "LastName2", "Speciality1", 2, "Group1");
        Student10 student2 = new Student10("FirstName2", "LastName1", "Speciality2", 1, "Group2");
        System.out.println(cmp.compare(student1, student2));
    }
}
