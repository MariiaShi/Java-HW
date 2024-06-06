package org.example.homeworks.homework4;

import java.util.Scanner;

public class WorkHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число секунд до конца рабочего дня: ");
        int seconds = scanner.nextInt();
        while (!areSecondsInRange(seconds)) {
            System.out.print("Введенное количество секунд больше длительности рабочего дня. Повторите ввод: ");
            seconds = scanner.nextInt();
        }
        printWorkingTime(seconds);
    }

    public static int countHours(int seconds) {
        int hours;
        hours = seconds / 3600;
        return hours;
    }

    public static boolean areSecondsInRange(int seconds) {
        return seconds > 0 && seconds < 28800;
    }

    public static void printWorkingTime(int seconds) {
        System.out.println("До конца рабочего дня осталось:");
        System.out.printf("                    в секундах -  %d", seconds);
        System.out.println();
        System.out.print("                    в часах - ");
        if (countHours(seconds) == 0) {
            System.out.println(" меньше часа");
        } else {
            System.out.printf(" %d часов", countHours(seconds));
        }
        System.out.println();
    }
}
