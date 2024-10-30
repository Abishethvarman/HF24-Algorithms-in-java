
/*  Definition
Selection Sort is a comparison-based sorting algorithm. It sorts an array by repeatedly selecting the smallest (or largest) element from the unsorted portion and swapping it with the first unsorted element. This process continues until the entire array is sorted..*/

/*What the Code is Going to Do:
Step 1: Find the minimum element in the unsorted portion of the array.
Step 2: Swap the minimum element with the first unsorted element to place it in its correct position.
Step 3: Repeat this process for the rest of the array until it is sorted. */

/*Part 1: Find the Minimum Element */

public class Selection_Sort {

    // Part 1: Find the minimum element index
    public static int findMinIndex(int[] arr, int start) {
        int minIndex = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {  // Check if current element is smaller than min
                minIndex = i;  // Update the minIndex
            }
        }
        return minIndex;  // Return the index of the smallest element
    }

    // Part 2: Swap two elements
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    
}


