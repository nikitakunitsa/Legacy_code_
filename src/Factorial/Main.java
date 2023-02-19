package Factorial;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recursive recursive = new Recursive();
        System.out.println(recursive.factorialNoRecursive());
        System.out.println(recursive.factorialRecursive(scanner.nextInt()));
    }
}