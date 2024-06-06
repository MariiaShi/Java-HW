package org.example.homeworks.homework4;

public class Nums {
    public static void main(String[] args) {
        System.out.println(selectNumber(9.999, 10.1));
        System.out.println(selectNumber(8, 10));
        System.out.println(selectNumber(9.5, 12));
        System.out.println(selectNumber(13, 2.5));
    }

    //Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
    //Числа могут быть, как целочисленные, так и дробные.
    public static double selectNumber(double n, double m) {
        double x1 = Math.abs(n - 10);  //9.5   0.5
        double x2 = Math.abs(m - 10);  //10.1   0.1
        return x1 < x2 ? n : m;
    }
}
