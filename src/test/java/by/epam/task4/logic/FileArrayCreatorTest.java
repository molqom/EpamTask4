package by.epam.task4.logic;

import by.epam.task4.data.Array;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileArrayCreatorTest {

    @Test
    public void createTestPositiveScenario() {
        //data
        String truePath = "./src/main/java/by/epam/task4/array.txt";
        ArrayCreator creator = new FileArrayCreator(truePath);
        //when
        Array expected = new Array(new int[]{1, 2, 3, 4, 5, 6, 7, 12, 13, 31, 123, 23, 1, 3, 2});
        Array actual = creator.create();
        //then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void createTestNegativeScenario() {
        //data
        String falsePath = "./src/main/java/by/epam/task4/arrayWRONG.txt";
        ArrayCreator creator = new FileArrayCreator(falsePath);
        //when
        Array expected = null;
        Array actual = creator.create();
        //then
        Assert.assertEquals(expected,actual);
    }
}