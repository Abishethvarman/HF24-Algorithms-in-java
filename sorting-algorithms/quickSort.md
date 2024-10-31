
# Quick Sort Implementation in Java

## Overview

This document provides a Java implementation of the Quick Sort algorithm. Quick Sort is a highly efficient sorting algorithm that employs the divide-and-conquer strategy. Its average-case time complexity is O(n log n), making it suitable for large datasets.

## Algorithm

The Quick Sort algorithm works by selecting a 'pivot' element from the array and partitioning the other elements into two subarrays according to whether they are less than or greater than the pivot. The steps are as follows:

1. **Choose a Pivot**: Select an element from the array as the pivot.
2. **Partition**: Rearrange the array so that elements less than the pivot come before it and elements greater than the pivot come after it. The pivot is then in its final position.
3. **Recursively Sort**: Apply the same process to the subarrays formed on either side of the pivot.

## Code Explanation

- **QuickSort Class**: Contains the methods required for the Quick Sort algorithm.
- **partition Method**: Rearranges the array based on the pivot and returns the final index of the pivot.
- **sort Method**: Recursively sorts the subarrays by calling the `partition` method.

## Complete Code

```java
/*
* @file
* @author Mansvi Kumar
* @details implementation of Quick Sort
*/
public class QuickSort {
    // This function takes the last element as pivot, places the pivot element at its correct position
    // in sorted array, and places all smaller (smaller than pivot) to left of pivot and all greater
    // elements to right of pivot
    int partition(int arr[], int low, int high) {
        int pivot = arr[high]; // pivot
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // The main function that implements Quick Sort
    void sort(int arr[], int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method
    public static void main(String args[]) {
        int arr[] = { 10, 7, 8, 9, 1, 5 };

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
```

