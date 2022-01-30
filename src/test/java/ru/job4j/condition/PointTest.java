package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void whenX0Y0AndX0Y2Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2.0;
        Assert.assertEquals(expected, a.distance(b), 0.0001);
    }

    @Test
    public void whenX5Y8AndX9Y3Then6And40() {
        Point a = new Point(5, 8);
        Point b = new Point(9, 3);
        double expected = 6.40312;
        Assert.assertEquals(expected, a.distance(b), 0.00001);
    }

    @Test
    public void whenX1Y1AndX1Y1Then0() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        double expected = 0.0;
        Assert.assertEquals(expected, a.distance(b), 0.1);
    }

    @Test
    public void whenX0Y0Z8AndX0Y2Z9Then2dot24() {
        Point c = new Point(0, 0, 8);
        Point d = new Point(0, 2, 9);
        double expected = 2.24;
        Assert.assertEquals(expected, c.distance3d(d), 0.01);
    }

    @Test
    public void whenX1Y1Z1AndX1Y1Z1Then0() {
        Point c = new Point(1, 1, 1);
        Point d = new Point(1, 1, 1);
        double expected = 0.0;
        Assert.assertEquals(expected, c.distance3d(d), 0.1);
    }
}