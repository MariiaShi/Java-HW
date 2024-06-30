package org.example.homeworks.homework8;

public class countMatches {
    public class Main {
        public static void main(String[] args) {
            // lotteryNumber = [1, 2, 3, 4, 5]
            // userNumber = [1, 2]

        }

        static int countMatches(int[] lotteryNumber, int[] userNumber) {


            int counter = 0;

            for (int i = 0; i < userNumber.length; i++) {
                for (int j = 0; j < lotteryNumber.length; j++) {
                    if (userNumber[i] == lotteryNumber[j]) {
                        counter++;
                        // System.out.println("Match");
                    }
                }
            }
            return counter;

        }

    }


}
