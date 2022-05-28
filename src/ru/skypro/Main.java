package ru.skypro;

import java.util.Arrays;
public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++){
            arr[i]=random.nextInt(100_000)+100_000;
        }
        return arr;}
        public static void main(String[] args) {
            java.util.Random random = new java.util.Random();
            int[] costs = generateRandomArray();
            int cost = 0, minCosts = 200001, maxCosts = -1;
            int sum = 0;
            float floatSum = 0f;
            float average = 0f;
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = 0; i < costs.length; i++) {
                costs[i] = random.nextInt(100_000) + 100_000;
                sum += costs[i];
                floatSum += costs[i];
                average = floatSum / 30;
                if (costs[i] > maxCosts) {
                    maxCosts = costs[i];
                    if (costs[i] < minCosts) {
                        minCosts = costs[i];
                    }
                }
            }
            System.out.println("Homework 5.1" + "\n" + "The total of all the costs in the month is " + sum + " rub");
            System.out.println("Homework 5.2" + "\n" + "The minimum of all the costs in the month is " + minCosts + " rub. ");
            System.out.println("The maximum of all the costs in the month is " + maxCosts + " rub");
            System.out.println("Homework 5.3" + "\n" + "The average of all the costs in the month is " + average + " rub. ");
            System.out.println("Homework 5.4");
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);}
    }}








