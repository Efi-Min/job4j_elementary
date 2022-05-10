package ru.job4j.ru.job4j.calculator;

public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        System.out.println(onePlusTwo);
        one = 11;
        two = 22;
        int result = one + two;
        System.out.println(result);
        int oneTime2 = one * 2;
        System.out.println(oneTime2);
        int size = 10;
        size = 100;
        size = size - 5;
        System.out.println(size);
    }
}