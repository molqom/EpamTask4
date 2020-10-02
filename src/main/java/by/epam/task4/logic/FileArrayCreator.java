package by.epam.task4.logic;

import by.epam.task4.data.Array;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileArrayCreator implements ArrayCreator {
    private String path;
    private Scanner scanner;
    public FileArrayCreator(String path){
        this.path = path;
    }
    @Override
    public Array create() {
        File file = new File(path);
        try {
            scanner = new Scanner(file);
            String inputStr = scanner.nextLine();
            String[] arrayStr = inputStr.split(", ");
            int[] array = new int[arrayStr.length];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(arrayStr[i]);
            }
            return new Array(array);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
