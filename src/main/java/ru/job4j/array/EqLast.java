package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(check(new int[]{1, 2, 3, 4, 5, 4}, new int[]{2, 4, 3, 2, 5}));
    }
}
