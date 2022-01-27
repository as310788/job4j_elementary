package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax5numbers() {
        int first = 1;
        int second = 2;
        int third = 5;
        int four = 0;
        int rsl = new Max().max(first, second, third, four);
        int expected = 5;
        Assert.assertEquals(expected, rsl);
    }
}