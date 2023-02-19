package Massive;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массив ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Заполните массив нужным количество элементов ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Заполенный массив: ");
        System.out.println(Arrays.toString(array));
        return array;
    }
}

