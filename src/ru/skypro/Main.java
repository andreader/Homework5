package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] costs = new int[30];
        float sum = 0f;
        float average = 0f;
        for (int i = 0; i < costs.length; i++) {
            costs[i] = random.nextInt(100_000) + 100_000;
            sum += costs[i];
            average = sum / 30;
                }
        System.out.println("The average of all the costs in the month is " + average + " rub. ");
            return costs;
    }
}




