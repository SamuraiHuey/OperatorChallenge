package com.example;

public class Main {
    public static void main(String[] args) {
        double firstValue = 20.00d;
        double secondValue = 80.00d;

        double multipliedSum = (firstValue + secondValue) * 100.00d;

        double modulusSum = multipliedSum % 40.00d;

        boolean remainderZero = (modulusSum == 0) ? true:false;

        System.out.println(remainderZero);

        if (!remainderZero){
            System.out.println("Got some remainder");
        }
    }
}