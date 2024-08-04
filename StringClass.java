package org.example.homeworks.homework2;

public class StringClass {
    public static void main(String[] args) {

        String str = new String("I study Basic Java!");

        char preLastChar = str.charAt(str.length() - 2);
        System.out.println("Пред-последний символ: " + preLastChar);


        boolean containsJava = str.contains("Java");
        System.out.println("Содержит 'Java': " + containsJava);


        String javaSubstring = str.substring(str.indexOf("Java"), str.indexOf("Java") + "Java".length());
        System.out.println("Вырезанная подстрока: " + javaSubstring);


        String replacedStr = str.replace('a', 'o');
        System.out.println("Строка после замены: " + replacedStr);


        String upperStr = str.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperStr);


        String lowerStr = str.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerStr);
    }
}

