package org.example.homeworknewnew;

import java.util.Arrays;

//Дан массив размера  n-1,
// содержащий только различные целые числа в диапазоне
// от 1 до n .
// Найдите недостающий элемент.
//
//
//input:
//arr[] = {1,2,3,5}
//out: 4
//
//
//arr[] = {6,1,2,8,3,4,7,10,5}
//out: 9
public class ArrayClass {
    public static void main(String[] args) {
        int arr[] = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        int answer = getNums(arr);
        System.out.println(answer);
    }

    public static int getNums(int[] array) {
        Arrays.sort(array);
        int result = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] != array[i] + 1) {
                result = array[i] + 1;
            }
        }
        return result;
    }
}
