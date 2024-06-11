package org.example.homeworks.homework6;

public class Temperature {
    public static void main(String[] args) {
        int temperature1;
        int temperature2;

        System.out.println(isTemperatureOK(101, 99));
        System.out.println(isTemperatureOK(90, 110));
        System.out.println(isTemperatureOK(110, 110));

    }

    public static boolean isTemperatureOK(int temperature1, int temperature2) {
        boolean result;
        if (temperature1 > 100 && temperature2 < 100) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}

