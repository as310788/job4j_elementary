package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        boolean condition = true;
        int result = condition ? right : left;
        return result;

    }

    public static void main(String[] args) {
        int rsl = Max.max(1, 2);
        System.out.println(rsl);
    }
}
