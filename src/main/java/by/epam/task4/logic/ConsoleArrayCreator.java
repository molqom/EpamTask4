package by.epam.task4.logic;

import by.epam.task4.data.Array;

import java.util.Scanner;
//todo
public class ConsoleArrayCreator implements ArrayCreator {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public Array create() {
        System.out.println("Enter your array: ");
        String inputStr = scanner.nextLine();
        String[] arrayStr = inputStr.split(" ");
        int[] array = new int[arrayStr.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(arrayStr[i]);
        }
        return new Array(array);
    }
}
