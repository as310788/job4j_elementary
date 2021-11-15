package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                rsl += array[i][j];
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
            System.out.println(sum(new int[][]{
                    {4, 2, 3},
                    {7, 1},
                    {3, 5, 6, 4}
            }));
        }
    }

