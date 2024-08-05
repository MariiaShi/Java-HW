package org.example.homeworks.homework3;

//Программа запрашивает у пользователя сумму в Евро для
// конвертации

//Реализовать метод, который конвертирует полученную сумму
// в сумму в долларах США
public class Converter {

    public static void main(String[] args) {
        double money = 100.50;
        System.out.println(convert(money));
    }

    public static double convert(double dollars) {
        return dollars * 0.91;
    }

}

