package ru.mirea.lab11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Student11 {
    private String firstName;
    private String lastName;
    private String speciality;
    private int grade;
    private String group;
    private Date dateOfBirth;

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student11(String firstName, String lastName, String speciality, int grade, String group, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.grade = grade;
        this.group = group;
        this.dateOfBirth=dateOfBirth;
    }

    public String toString(String df) {
        return "Student "+firstName+" born on "+(new SimpleDateFormat(df).format(dateOfBirth));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой формат даты хотите выбрать?");
        String df="dd MM yyyy";
        while(true) {
            System.out.println("1) DD.MM.YYYY\n2) MM/DD/YYYY\n3) YYYY MM DD");
            int choice = scanner.nextInt();
            if(choice==0) break;
            if(choice==1){
                df="dd.MM.yyyy";
            }else if(choice==2){
                df="MM/dd/yyyy";
            }else if(choice==3){
                df="yyyy MM dd";
            }else continue;
            break;
        }
        Student11[] student11s = new Student11[5];
        Random rnd = new Random();
        for(int i=0;i<5;++i)
            student11s[i]=new Student11("FirstName"+i, "LastName"+i, "Speciality"+i, i, "Group"+i,
                    new Date(rnd.nextLong(Long.parseLong("315522000000"), Long.parseLong("1104526800000"))));
        for(Student11 s : student11s)
            System.out.println(s.toString(df));
    }
}
