package org.example.homeworks.homework1;

public class StringTest {
    public static void main(String[] args) {
        String string = new String("I study Basic Java!");

        printStr(string);

        System.out.println(string.length());
        System.out.println(string.charAt(string.length() - 2));

        System.out.println(string.contains("Java"));

        System.out.println(string.substring(14, 18));

        System.out.println(string.replace('a','o'));

        System.out.println(string.toLowerCase());

        System.out.println(string.toUpperCase());
    }

    public static void printStr(String str) {
        System.out.println(str + "!!");
    }


}
