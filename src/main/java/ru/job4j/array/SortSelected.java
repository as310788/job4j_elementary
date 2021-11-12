package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            data[index] = data[i];
            data[i] = min;
            }

        return data;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {6, 3, 4, 5, 9, 1};
        int[] rsl = sort(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}
