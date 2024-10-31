
# Merge Sort Implementation in Java

## Overview

This document provides a Java implementation of the Merge Sort algorithm. Merge Sort is an efficient, stable, comparison-based, divide-and-conquer sorting algorithm that performs better on larger datasets than simpler algorithms like Insertion Sort or Bubble Sort. Its time complexity is O(n log n), making it an ideal choice for sorting large arrays.

## Algorithm

The Merge Sort algorithm works by recursively dividing the array into two halves until each subarray contains a single element. It then merges the smaller sorted subarrays to produce larger sorted arrays until the entire array is sorted. This process involves three main steps:

1. **Divide**: Recursively split the array into two halves until each half contains a single element.
2. **Conquer**: Sort the subarrays by recursively calling the sort function on each half.
3. **Combine**: Merge the two halves into a sorted array using a helper function.

## Code Explanation

- **MergeSort Class**: Contains the primary methods required for the Merge Sort algorithm.
- **merge Method**: Merges two subarrays by comparing elements and merging them into the original array in sorted order.
  - Takes `arr[]`, `l`, `m`, and `r` as inputs, where `l` is the starting index, `m` is the midpoint, and `r` is the end index.
  - Initializes two temporary arrays, `L[]` and `R[]`, to hold the elements of the two halves.
  - Merges elements back into `arr[]` in sorted order.
- **sort Method**: Recursively splits the array and calls `merge` to sort and merge each half.
  - This method divides the array until each subarray has only one element.

## Complete Code

```java
/*
* @file
* @author Mansvi Kumar
* @details implementation of Merge Sort
*/
public class MergeSort {
    // Merges two subarrays of arr[]
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /* Copy data to temp arrays */
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using merge()
    void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
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
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
```

