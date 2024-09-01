package org.example.homeworknew;

//Создайте массив из 5 случайных целых чисел из интервала [10;99]
//Выведите его на консоль в строку.
//Определите и выведите на экран сообщение о том, является ли
// массив строго возрастающей последовательностью.
public class ArrayClass1 {
    public static void main(String[] args) {
        int[] array = {1, 5, 8, 80, 95};
        System.out.println(array.toString());
        boolean condition = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < array[i]) {
                condition = false;
            }
        }
        if (condition == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
