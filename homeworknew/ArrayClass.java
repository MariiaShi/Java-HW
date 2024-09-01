package org.example.homeworknew;

import java.util.Arrays;


//Создайте массив из 8 случайных целых чисел из интервала [1;50]
//Выведите массив на консоль в строку.
//Замените каждый элемент с нечетным индексом на ноль.
//Снова выведете массив на консоль в отдельной строке.

public class ArrayClass {
    public static void main(String[] args) {
        int[] array = {1, 3, 10, 35, 33, 40, 43, 50};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }

        }

        System.out.println(Arrays.toString(array));
    }
}