package Factorial;

import java.util.Scanner;

public class Recursive {
    public int factorialNoRecursive() {
        Scanner scanner = new Scanner(System.in);
        int result = 1;
        System.out.println("Введите число");
        int quantity = scanner.nextInt();
        for (int i = 1; i <= quantity; i++) {
            result = result * i;
        }
        return result;
    }

    public int factorialRecursive(int quantity) {
        Scanner scanner = new Scanner(System.in);
        if (quantity <= 1) return quantity;
        else {
            return quantity * factorialRecursive(quantity - 1);
        }
    }
}
