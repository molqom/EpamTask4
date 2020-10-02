package by.epam.task4;

import by.epam.task4.data.Array;
import by.epam.task4.logic.ArrayCreator;
import by.epam.task4.logic.ConsoleArrayCreator;
import by.epam.task4.logic.FileArrayCreator;
import by.epam.task4.logic.RandomArrayGenerator;
import by.epam.task4.view.Printer;
import by.epam.task4.view.PrinterImpl;

/**
 * Создание типа Array, который является классом оболочкой над массивом целого типа. В данном типе должны быть
 * реализованы конструкторы (позволяющие несколькими способами создавать объекты типа), get-ы, set-ы и переопределенные
 * методы класса Object (toString(), equals(), hasCode()).
 * Программа должна иметь следующие возможности:
 * 1.   merge+  Сортировать массив тремя способами. (пузырьком, вставки, слияние, quick sort)
 * 2.     Осуществлять поиск элемента массива (использовать алгоритм бинарного поиска).
 * 3.     Нахождение максимального и минимального элемента массива.
 * 4.   v+  Получить все простые числа находящиеся в массиве.
 * 5.     Получить все числа Фибонначчи находящиеся в массиве.
 * 6.     Получить все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
 * 7.   v  Заполнения элементов массива и с консоли, и с файла и с помощью генерации случайных чисел.
 *  +++++ pure fabrication ++++
 */
public class Runner {
    public static void main(String[] args) {
        System.out.println("task 4");
        ArrayCreator fileArrayCreator = new FileArrayCreator("./src/main/java/by/epam/task4/array.txt");
        Array fileArray = fileArrayCreator.create();
        Printer printer = new PrinterImpl();
        printer.printArray(fileArray);

        ArrayCreator randomArrayCreator = new RandomArrayGenerator(10);
        Array randomArray = randomArrayCreator.create();
        printer.printArray(randomArray);

        ArrayCreator consoleArrayCreator = new ConsoleArrayCreator();
        Array consoleArray = consoleArrayCreator.create();
        printer.printArray(randomArray);


    }
}
