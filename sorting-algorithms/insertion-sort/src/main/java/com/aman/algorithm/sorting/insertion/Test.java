package com.aman.algorithm.sorting.insertion;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {

        long startTime = System.nanoTime();
        ;int[] unsortedArray = new int[20];

        // Fill array with random int values
        for (int i = 0; i < unsortedArray.length; i++) {
            int randomNumber = ThreadLocalRandom.current().nextInt(0, 19);
            unsortedArray[i] = randomNumber;
        }

        System.out.print("Unsorted Array : ");
        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.print(unsortedArray[i] + " ");
        }

        InsertionSort insertionSort = new InsertionSort();
        int[] sortedArray = insertionSort.sort(unsortedArray);

        System.out.print("\nSorted Array : ");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }

        long endTime = System.nanoTime();
        System.out.println("\nRunning Time : " + (endTime - startTime) + " nanoseconds.");
        long endTimeMs = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
        System.out.println("Running Time : " + endTimeMs + " miliseconds.");
        long endTimeSec = TimeUnit.MILLISECONDS.toSeconds(endTimeMs);
        System.out.println("Running Time : " + endTimeSec + " seconds.");

    }

}