package org.example.homeworks.homework2;

public class Numbers {
    public static void main(String[] args) {
        //Переведите число 333 из 16-ричной в 10-ричную
        String hexDecimal= "333";
        int decimalNumber = Integer.parseInt(hexDecimal, 16);
        System.out.println("16-ричное число " + hexDecimal + " в 10-ричном формате это - " + decimalNumber);

        //101101 в двоичной, переведите в 10-ричную
        String binNumber = "101101";
        int binDecimal = Integer.parseInt(binNumber, 2);
        System.out.println("Двоичное число " + binNumber + " в 10-ричном формате это - " + binDecimal);

        //124 в десятичной, переведите в 2-ичную
        int decNumber = 124;
        String binNumber2 = Integer.toBinaryString(decNumber);
        System.out.println("Десятичное число " + decNumber + " в двоичном формате это - " + binNumber2);

        //Переведите число 819 из 10-ричной в 16-ричную
        int hexDec = 819;
        String hexNum = Integer.toHexString(hexDec);
        System.out.println("Десятичное число " + hexDec + " в 16-ричном формате это - " + hexNum);
    }
}




