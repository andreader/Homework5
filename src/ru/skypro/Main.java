package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] costs = new int[30];
        int cost = 0, minCosts = 200001, maxCosts = -1;
        for (int i = 0; i < costs.length; i++) {
            costs[i] = random.nextInt(100_000) + 100_000;
            if (costs[i] > maxCosts) {
                maxCosts = costs[i];
                if (costs[i] < minCosts) {
                    minCosts = costs[i];
                }
            }
        }
        System.out.println("The minimum of all the costs in the month is " + minCosts + " rub. ");
        System.out.println("The maximum of all the costs in the month is " + maxCosts + " rub");
            return costs;
    }
}




