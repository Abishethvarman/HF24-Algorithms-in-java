# SelectionSort

  
##  Definition
  
Selection Sort is a comparison-based sorting algorithm. It sorts an array by repeatedly selecting the smallest (or largest) element from the unsorted portion and swapping it with the first unsorted element. This process continues until the entire array is sorted..

## What the Code is Going to Do:
Step 1: Find the minimum element in the unsorted portion of the array.
Step 2: Swap the minimum element with the first unsorted element to place it in its correct position.
Step 3: Repeat this process for the rest of the array until it is sorted.

## find the minimum element
public static int findMinIndex(int[] arr, int start) {
    int minIndex = start;
    for (int i = start + 1; i < arr.length; i++) {
        if (arr[i] < arr[minIndex]) {  // Find the smallest element
            minIndex = i;
        }
    }
    return minIndex;
}

## Swepping Element
public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];  // Store one element temporarily
    arr[i] = arr[j];    // Swap
    arr[j] = temp;      // Complete the swap
}



