package Massive;

public class Main {
    public static void main(String[] args) {
        ArrayInverter arrayInverter = new ArrayInverter();
        ArrayInput arrayInput = new ArrayInput();
        arrayInverter.invert(arrayInput.inputArray());
    }
}
