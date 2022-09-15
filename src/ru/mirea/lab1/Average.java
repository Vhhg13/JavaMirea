package ru.mirea.lab1;

public class Average {
    public static void main(String[] args) {
        int[] numArray={3, 1, 6, 3, 4, 7, 8, 1, 9, 0};
        int sum=0;
        for(int i : numArray)
            sum+=i;
        System.out.println("Сумма значений элементов массива - " + sum);
        System.out.println("Среднее значение чисел массива - " + (float)sum/numArray.length);
    }
}