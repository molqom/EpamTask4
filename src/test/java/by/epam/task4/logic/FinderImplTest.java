package by.epam.task4.logic;

import by.epam.task4.data.Array;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FinderImplTest {

    @Test
    public void findPrimeNumbersTest() {
        //data
        Finder finder = new FinderImpl();
        Array array = new Array(new int[]{-1, -200, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14});
        //when
        Array expected = new Array(new int[]{2, 3, 5, 7, 11});
        Array actual = finder.findPrimeNumbers(array);
        //then
        Assert.assertEquals(expected, actual);
    }
}