package org.example.homeworks.homework5;
//Реализуйте программу, которая попросит пользователя ввести три целых числа (используйте сканер) и
// напечатает максимум из трех чисел.

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();


        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }


        System.out.println("Максимальное из введенных чисел: " + max);
    }
}