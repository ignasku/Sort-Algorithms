package com.ignasku.shellsort;

public class ShellSort {

    public static void main(String[] args) {

        // Worst case: O(n^2) complexity
        // Unstable algorithm
        // Mainly used to improve insertion sort, can be used for bubble sort too
        // Shell sort implementation
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int gap = intArray.length / 2; gap > 0; gap /= 2){

            // Essentially insertion sort
            for(int i = gap; i < intArray.length; i++){
                int newElement = intArray[i];

                int j = i;

                while(j >= gap && intArray[j - gap] > newElement){
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = newElement;
            }
        }

        // Printing sorted array
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}