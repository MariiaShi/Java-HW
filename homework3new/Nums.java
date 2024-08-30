package org.example.homework3new;
// 1 уровень сложности: №1
//
//Создать программу, выводящую на экран ближайшее
// к 10 из двух чисел, записанных в переменные m и n.
//Числа могут быть, как целочисленные, так и дробные.
//
//
//Например :
//ввод : m=10.5, n=10.45
//вывод: Число 10.45 ближе к 10.

public class Nums {
    public static void main(String[] args) {
        double m = 10.5;
        double n = 10.45;
        double target = 10.0;


        double distanceM = Math.abs(m - target);
        double distanceN = Math.abs(n - target);

        // выводим  результат
        if (distanceM < distanceN) {
            System.out.println("Число " + m + " ближе к 10.");
        } else {
            System.out.println("Число " + n + " ближе к 10.");
        }
    }
}

