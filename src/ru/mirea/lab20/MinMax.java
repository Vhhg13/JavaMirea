package ru.mirea.lab20;

public class MinMax<T extends Comparable<T>>{
    T[] arr;
    public MinMax(T[] arr) throws InstantiationException{
        if(arr.length!=0)
            this.arr = arr;
        else
            throw new InstantiationException("Array cant be of size zero!");
    }
    public T getMax(){
        T max = arr[0];
        for(int i=1;i<arr.length;++i){
            if(arr[i].compareTo(max)>0){
                max=arr[i];
            }
        }
        return max;
    }
    public T getMin(){
        T min = arr[0];
        for(int i=1;i<arr.length;++i){
            if(arr[i].compareTo(min)<0){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Integer[] ints = new Integer[5];
        for(int i=0;i<5;++i) {
            ints[i] = (int) (Math.random() * 100);
            System.out.print(ints[i]+" ");
        }
        System.out.println();
        MinMax<Integer> minMax=null;
        try {
            minMax = new MinMax<>(ints);
        }catch(InstantiationException e){
            System.out.println("Array of size zero");
        }
        System.out.println("min is "+minMax.getMin());
        System.out.println("max is "+minMax.getMax());
    }
}
