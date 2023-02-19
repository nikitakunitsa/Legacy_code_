package String;

import java.util.Scanner;

public class Splitting {
    public void splitDelimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку которую хотите разделить");
        String str = scanner.nextLine();
        String[] subStr;
        System.out.println("Введите разделитель");
        String delimeter = scanner.nextLine();
        subStr = str.split(delimeter);
        System.out.println("Делим строку по разделителю " + delimeter);
        for (int i = 0; i < subStr.length; i++) {
            System.out.println(subStr[i]);
        }
    }

    public void splitWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку которую хотите разделить ");
        String str = scanner.nextLine();
        System.out.println("Строка до разбиения " + str);
        String[] words = str.split(" ");
        System.out.println("После разбиения: ");
        for (String subStr : words) {
            System.out.println(subStr);
        }
    }

    public void splitLetters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку которую хотите разделить ");
        String str = scanner.nextLine();
        char[] strToArray = str.toCharArray();
        System.out.println("Полученная строка: ");
        for (int i = 0; i < strToArray.length; i++) {
            System.out.print(strToArray[i] + " ");
        }
    }
}

