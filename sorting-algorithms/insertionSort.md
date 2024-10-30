# Insertion Sort Implementation in Java

## Overview

This document describes the implementation of the Insertion Sort algorithm in Java. Insertion Sort is a simple and intuitive sorting algorithm that builds a sorted array one element at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.

## Algorithm

The Insertion Sort algorithm works by dividing the array into two parts: a sorted part and an unsorted part. The algorithm iteratively picks the next element from the unsorted part and inserts it into the correct position in the sorted part. 

## Code Explanation

- The `InsertionSort` class contains the main logic for the sorting algorithm.
- The `sort` method performs the sorting operation:
  - It iterates over each element starting from the second element.
  - For each element, it compares it with the sorted elements and shifts larger elements to the right.
  - Once the correct position is found, it inserts the key.
  
- The `printArray` method is a utility function that prints the elements of the array.
- The `main` method serves as the entry point for the program, where an array is defined, sorted, and printed.

## Complete Code

```java
/*
* @file
* @author Mansvi Kumar
* @details implementation of Insertion Sort
*/
public class InsertionSort {
    /* Function to sort array using insertion sort */
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };

        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        printArray(arr);
    }
}
