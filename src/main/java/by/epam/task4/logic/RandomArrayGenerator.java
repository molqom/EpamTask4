package by.epam.task4.logic;

import by.epam.task4.data.Array;

import java.util.Random;

public class RandomArrayGenerator implements ArrayCreator {
    private int length;
    public RandomArrayGenerator(int length){
        this.length = length;
    }
    @Override
    public Array create() {
        Array array = new Array(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array.add(i, random.nextInt());
        }
        return array;
    }
}
