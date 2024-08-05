package org.example.homeworks.homework3;

//Реализовать программу, выводящую на экран результаты:
//Сложения двух чисел
//Вычитания двух чисел
//Умножения двух чисел
//Деления двух чисел
//Каждая из арифметических операций должна быть реализована как отдельный метод.
public class OperationsNumbers {
    public static void main(String[] args) {
        int x = 0;
        int resSum = sum(10, 5);
        int resSub = subtract(10, 5);
        int resMul = multiply(10, 5);
        int resDiv = divide(10, 5);
        System.out.println(resSum);
        System.out.println(resSub);
        System.out.println(resMul);
        System.out.println(resDiv);
    }

    static int sum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    static int subtract(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    static int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    static int divide(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }

}
