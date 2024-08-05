package org.example.homeworks.homework3;

import java.util.Scanner;
//Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
//Например:
//ввод - mama, papa
//вывод - mapa

public class WordMerger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое слово:");
        String word1 = scanner.nextLine();

        System.out.println("Введите второе слово:");
        String word2 = scanner.nextLine();

//        for (int i = 0; i < word1.length(); i++) {
//            char symbol = word1.charAt(i);
//        }
        String result = "";

        if (word1.length() % 2 == 0) {
            for (int i = 0; i < word1.length() / 2; i++) {
                char symbol = word1.charAt(i);
                result = result + symbol;

            }
        }
        if (word2.length() % 2 == 0) {
            for (int i = word2.length() / 2; i < word2.length(); i++) {
                char symbol = word2.charAt(i);
                result = result + symbol;
            }
        }

        System.out.println(result);
    }

}
