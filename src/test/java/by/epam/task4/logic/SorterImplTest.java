package by.epam.task4.logic;

import by.epam.task4.data.Array;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SorterImplTest {

    @Test
    public void sortTest() {
        //data
        Sorter sorter = new SorterImpl();
        Array array = new Array(new int[]{1,4,2,7,3,5,4,4,9,10,4,0,-1,-6});
        //when
        Array expected = new Array(new int[]{-6,-1,0,1,2,3,4,4,4,4,5,7,9,10});
        Array actual = sorter.sort(array);
        //then
        Assert.assertEquals(expected,actual);
    }
}