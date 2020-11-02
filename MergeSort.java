package com.ignasku.mergesort;

public class MergeSort {

    public static void main(String[] args) {

        // Recursive algorithm
        // Involves splitting and merging arrays
        // O(nlog(n)) - base 2 complexity
        // NOT an in-place algorithm, takes a lot of memory
        // Stable algorithm
        // Merge sort implementation
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);

        // Printing sorted array
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    // Recursive method
    public static void mergeSort(int[] input, int start, int end){

        // Condition to break recursion
        if(end - start < 2){
            return;
        }

        // Partitioning
        int mid = (start + end) / 2;
        // Left array
        mergeSort(input, start, mid);
        // Right array
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end){
        // Optimization
        if(input[mid - 1] <= input[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while(i < mid && j < end){
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // Optimization
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);

    }
}