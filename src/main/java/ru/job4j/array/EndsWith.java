package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        for (int i = 0; i < post.length; i++) {
            if (post[post.length - 1 - i] != word[word.length - 1 - i]) {
                return false;
                }
            }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(endsWith(new char[]{'H', 'e', 'l', 'l', 'o'}, new char[] {'H', 'e', 'l', 'l', 'o'}));
    }
}

