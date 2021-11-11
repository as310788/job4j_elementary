package ru.job4j.array;

public class FindLoop {
        public static int indexOf(int[] data, int el, int start, int finish) {
            int rst = -1;
                for (int i = start; i <= finish; i++) {
                if (data[i] == el) {
                    rst = i;
                    break;
                }
            }
            return rst;
        }

    public static void main(String[] args) {
            System.out.println(indexOf(new int[]{2, 8, 3, 23, 12, 6}, 23, 0, 5));

        }
}


