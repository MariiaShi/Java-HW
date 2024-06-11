package org.example.homeworks.homework5;
//Реализуйте программу, которая попросит пользователя ввести год и напечатать этот год isLeap (високосный) или нет.

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();


        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println("Год " + year + " является високосным: " + isLeap);
    }
}