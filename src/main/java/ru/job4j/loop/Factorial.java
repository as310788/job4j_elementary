package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int index = 2; index <= n; index++) {
            result *= index;
        }
            return result;
    }

        public static void main(String[] args) {
            System.out.println(Factorial.calc(4));
}
}



