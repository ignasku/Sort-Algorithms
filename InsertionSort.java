package com.ignasku.insertionsort;

public class InsertionSort {

    public static void main(String[] args) {

        // O(n^2) complexity
        // Stable algorithm
        // Insertion sort implementation
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];
            int i;

            for(i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--){
                intArray[i] = intArray[i-1];
            }

            intArray[i] = newElement;
        }

        // Printing sorted array
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}