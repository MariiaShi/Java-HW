package org.example.homeworks.homework7;

public class RandomNum {
    public static void main(String[] args) {
        RandomNum rand = new RandomNum();
        int[] array = new int[5];


        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(90) + 10;
        }

        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();


        boolean isIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break;
            }
        }


        if (isIncreasing) {
            System.out.println("The array is strictly increasing.");
        } else {
            System.out.println("The array is not strictly increasing.");
        }
    }

    private int nextInt(int i) {
        return 0;
    }
}

