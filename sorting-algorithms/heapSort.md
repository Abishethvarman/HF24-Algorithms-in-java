
# Heap Sort Implementation in Java

## Overview

This document provides a Java implementation of the Heap Sort algorithm. Heap Sort is a comparison-based sorting algorithm that utilizes a binary heap data structure. Its time complexity is O(n log n) for both average and worst-case scenarios.

## Algorithm

The Heap Sort algorithm consists of two main phases:

1. **Build a Heap**: Convert the array into a max heap (for ascending order). In a max heap, each parent node is greater than or equal to its child nodes.
2. **Sort the Heap**: Repeatedly extract the maximum element from the heap and reconstruct the heap until the array is sorted.

## Code Explanation

- **HeapSort Class**: Contains the methods required for the Heap Sort algorithm.
- **heapify Method**: Maintains the heap property by adjusting the tree structure.
- **sort Method**: Performs the heap sort operation by building the heap and then extracting elements.

## Complete Code

```java
/*
* @file
* @author Mansvi Kumar
* @details implementation of Heap Sort
*/
public class HeapSort {
    // Rearranges a subtree rooted with node i which is an index in arr[].
    // n is size of heap
    void heapify(int arr[], int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    // The main function to sort an array of given size
    void sort(int arr[]) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
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

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
```

