package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
        String a = "But I am a newbie.";
        String text = idea + a;
        int year = 2021;
        String exit = idea + year;
        System.out.println(idea+text+exit);
    }
}
