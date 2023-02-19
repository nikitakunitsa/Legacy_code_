package Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number0 = 1;
        int number1 = 1;
        int result;
        System.out.println("Введите число фабиначи");
        int numberFinoBacci = scanner.nextInt();
        System.out.print(number0 + " " + number1 + " ");
        for (int i = 3; i <= numberFinoBacci; i++) {
            result = number0 + number1;
            System.out.print(result + " ");
            number0 = number1;
            number1 = result;
        }
        System.out.println();
    }
}
