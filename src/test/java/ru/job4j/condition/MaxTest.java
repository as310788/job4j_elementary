package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int third = 4;
        int four = 0;
        int rsl = new Max().max(first, second, third, four);
        int expected = 4;
        Assert.assertEquals(expected, rsl);
    }
}