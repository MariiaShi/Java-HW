package org.example.homeworks.homework5;
//1. Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
//Реализует логический метод canBuy,  возвращающий boolean
//Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//Отобразите строку «Я могу купить еду, это ……» и значение.
//Реализуйте программу, которая попросит пользователя ввести год и напечатать этот год isLeap (високосный) или нет.
//Реализуйте программу, которая попросит пользователя ввести три целых числа (используйте сканер) и напечатает максимум из трех чисел.

import java.util.Scanner;

public class ShopChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Edeka открыт? (true/false): ");
        boolean isEdekaOpen = scanner.nextBoolean();

        System.out.print("Rewe открыт? (true/false): ");
        boolean isReweOpen = scanner.nextBoolean();

        boolean canBuy = isEdekaOpen || isReweOpen;
        System.out.println("Я могу купить еду, это " + canBuy);
    }
}