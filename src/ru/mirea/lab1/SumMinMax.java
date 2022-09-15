package ru.mirea.lab1;

public class SumMinMax {
    public static void main(String[] args){

        // Создание и заполнене массива случайными значениями
        int[] numArray=new int[10];
        int i;
        for(i=0;i<10;++i)
            numArray[i]=(int)(Math.random()*100)%100;

        System.out.print("Рабочий массив:");
        for(i=0;i<10;++i)
            System.out.print(" "+numArray[i]);




        int sum=0;
        System.out.print("\nПодсчёт суммы с помощью цикла while дал результат ");
        i=0;
        while(i<10)
            sum+=numArray[i++];
        System.out.println(sum);

        sum=0;
        i=0;
        System.out.print("Подсчёт суммы с помощью цикла do while дал результат ");
        do{
            sum+=numArray[i++];
        }while(i<10);
        System.out.println(sum);

        int min=9999;
        int max=0;
        for(int j : numArray){
            if(j<min)
                min=j;
            else if(j>max)
                max=j;
        }
        System.out.format("Минимальное число массива - %d\nМаксимальное число массива - %d\n", min, max);
    }
}
