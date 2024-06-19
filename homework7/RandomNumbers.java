package org.example.homeworks.homework7;

import org.example.For.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(50) + 1;
        }

        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }


        System.out.println("Modified array:");
        for (int num : array) {
            System.out.print(num + " ");

        }
    }
}
