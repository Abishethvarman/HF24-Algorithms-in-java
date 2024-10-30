# Bubble Sort Algorithm

## Definition
Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.

## Code Implementation
```java
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

## Use Cases
* Used in simple scenarios where performance isn't a concern.
* Useful for educational purposes to understand basic sorting logic.

## Complexity Analysis
* Time Complexity: O(n^2) in the worst case.
* Space Complexity: O(1) as it is an in-place sorting algorithm.

## Special Remarks
* Bubble Sort is highly inefficient for large datasets.
* However, it is useful as a learning tool to introduce sorting algorithms.
