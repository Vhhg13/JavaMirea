package ru.mirea.lab41.Phone;

/*
2.
Создайте класс Phone, который содержит переменные number,
model и weight.
1)Создайте три экземпляра этого класса. 2) Выведите на консоль значения
их переменных. 3) Добавить в класс Phone методы: receiveCall, имеет один
параметр – имя звонящего. 4)Выводит на консоль сообщение “Звонит {name}”.
5)Метод getNumber – возвращает номер телефона. 6) Вызвать эти методы для
каждого из объектов. 7) Добавить конструктор в класс Phone, который
принимает на вход три параметра для инициализации переменных класса -
number, model и weight. 8)Добавить конструктор, который принимает на вход
два параметра для инициализации переменных класса - number, model.
9)Добавить конструктор без параметров. 10)Вызвать из конструктора с тремя
параметрами конструктор с двумя. 11)Добавьте перегруженный метод.
receiveCall, который принимает два параметра - имя звонящего и номер
телефона звонящего. 12)Вызвать этот метод. 13)Создать метод sendMessage с
аргументами переменной длины. Данный метод принимает на вход номера
телефонов, которым будет отправлено сообщение. 14)Метод выводит на
консоль номера этих телефонов.
 */

public class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.printf("%s calls\n", name);
    }

    public void receiveCall(String name, int number){
        this.receiveCall(name);
        System.out.println("His number is " + number);
    }

    public void sendMessage(int ... numbers){
        for(int n : numbers)
            System.out.println(n);
    }

    public Phone() {
        number=123456778;
        model="No name";
        weight=300;
    }

    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Phone[] phone = new Phone[3];
        phone[0] = new Phone(894512345, "Samsung", 12);
        phone[1] = new Phone(194594594, "Sony", 1);
        phone[2] = new Phone();
        for(Phone p : phone)
            System.out.println(p);
        System.out.println();
        for(Phone p : phone){
            p.receiveCall("Bob", 987654322);
            System.out.println("Your number is " + p.getNumber() + "\n");
        }
        System.out.println();
        phone[0].sendMessage(123, 546, 789, 100);

    }
}
