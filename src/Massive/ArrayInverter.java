package Massive;

import java.util.Arrays;

public class ArrayInverter {
    public void invert(int[] array) {
        int[] myArray = array;
        int size = myArray.length;
        for (int i = 0; i < size / 2; i++) {
            int temp = myArray[i];
            myArray[i] = myArray[size - 1 - i];
            myArray[size - 1 - i] = temp;
        }
        System.out.println("Массив после разварота:");
        System.out.println(Arrays.toString(myArray));
    }
}

