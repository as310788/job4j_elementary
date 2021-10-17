package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void whenExist() {
        double ab = 3.0;
        double ac = 2.0;
        double bc = 1.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }

        @Test
        public void whenExist2() {
            double ab = 2.0;
            double ac = 2.0;
            double bc = 2.0;
            boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }
}