package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    int[] arr = generateRandomArray();}
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] costs = new int[30];
        int sum = 0;
        for (int i = 0; i < costs.length; i++) {
            costs[i] = random.nextInt(100_000) + 100_000;
                sum += costs[i];
        }
        System.out.print("The total of all the costs in the month is " + sum + " rub");
        return costs;
        }
    }



