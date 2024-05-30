package org.example.homeworks.homework3;
public class ArithmeticOperations {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

  
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка: Деление на ноль!");
            return Double.NaN; // возвращаем "не число" в случае деления на ноль
        }
        return a / b;
    }

    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 2.5;

        System.out.println("Сложение: " + add(num1, num2));
        System.out.println("Вычитание: " + subtract(num1, num2));
        System.out.println("Умножение: " + multiply(num1, num2));
        System.out.println("Деление: " + divide(num1, num2));
    }
}