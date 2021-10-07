package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square162() {
        int expected = 162;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K15Square96000() {
        int expected = 96000;
        int p = 10;
        double k = 15;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

        @Test
        public void whenP8K7Square7168() {
            int expected = 7168;
            int p = 8;
            double k = 7;
            double out = SqArea.square(p, k);
            Assert.assertEquals(expected, out, 0.01);
        }
}