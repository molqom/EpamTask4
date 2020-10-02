package by.epam.task4.view;

import by.epam.task4.data.Array;

public class PrinterImpl implements Printer {
    @Override
    public void printArray(Array array) {
        System.out.println(array.toString());
    }
}
