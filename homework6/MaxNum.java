package org.example.homeworks.homework6;

public class MaxNum {
    public static void main(String[] args) {
        int days = 0;
        int N = 999;

        while (N > 1) {
            int largestSum = findMaxDivider(N);
            N = N - largestSum;
            days++;
        }

        days++;

        System.out.println(days);
    }

    public static int findMaxDivider(int number) {
        int largestDivisor = 1;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                largestDivisor = i;
            }
        }
        return largestDivisor;
    }
}
