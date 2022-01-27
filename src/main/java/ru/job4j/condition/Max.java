package ru.job4j.condition;

public class Max {
    public int max(int first, int second) {

        return first > second ? first : second;
    }

    public int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public int max(int first, int second, int third, int four) {
        return max(first, second, max(third, four));
    }

    public static void main(String[] args) {
        int rsl = new Max().max(10, 358, 5, 99);
        System.out.println(rsl);
    }
}