package ru.mirea.lab41.n4;
/*
4.
Создать класс Матрица. Класс должен иметь следующие поля: 1)
двумерный массив вещественных чисел; 2) количество строк и столбцов в
матрице. Класс должен иметь следующие методы:
1) сложение с другой матрицей;
2) умножение на число;
3) вывод на печать;
4) умножение матриц
 */

public class Matrix {
    private int dimX, dimY;
    private double[][] array;

    public Matrix(int dimX, int dimY, double[][] array) {
        this.dimX = dimX;
        this.dimY = dimY;
        this.array = new double[dimX][dimY];
        for (int i = 0; i < dimX; ++i)
            for (int j = 0; j < dimY; ++j)
                this.array[i][j] = array[i][j];
    }

    public Matrix add(Matrix m) {
        for (int i = 0; i < dimX; ++i)
            for (int j = 0; j < dimY; ++j)
                array[i][j] += m.array[i][j];
        return this;
    }

    public Matrix mul(double n) {
        for (int i = 0; i < dimX; ++i)
            for (int j = 0; j < dimY; ++j)
                array[i][j] *= n;
        return this;
    }

    public void print() {
        for (int i = 0; i < dimX; ++i) {
            System.out.print("[ ");
            for (int j = 0; j < dimY; ++j) {
                System.out.printf("%7.2f ", array[i][j]);
            }
            System.out.print(" ]\n");
        }
    }

    public Matrix mul(Matrix m) {
        if (dimY != m.dimX) return null;
        int newDimX = dimX;
        int newDimY = m.dimY;
        double[][] arr = new double[newDimX][newDimY];
        for (int i = 0; i < newDimX; ++i)
            for (int j = 0; j < newDimY; ++j) {
                double sum = 0;
                for (int k = 0; k < dimY; ++k)
                    sum += array[i][k] * m.array[k][j];
                arr[i][j] = sum;
            }
        return new Matrix(newDimX, newDimY, arr);
    }

    public static void main(String[] args) {
        double[][] arr = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        Matrix m1 = new Matrix(2, 3, arr);
        m1.mul(2).print();
        System.out.println();

        double[][] brr = {{1.0, 1.0}, {1.0, 0}, {1.0, 0}};
        Matrix m2 = new Matrix(3, 2, brr);
        m2.print();
        System.out.println();

        m1.mul(m2).print();
    }
}
