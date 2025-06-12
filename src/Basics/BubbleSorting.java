package Basics;

import java.util.Arrays;  // Import Arrays utility for printing arrays

public class BubbleSorting {

    public static void main(String[] args) {
        // Example array to sort
        int[] arr = {23, 12, 67, 89, 54};

        int n = arr.length;

        // Outer loop for the number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) { // Fix inner loop limit
                // Swap if the current element is greater than the next
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array using Arrays.toString()
        System.out.println(Arrays.toString(arr));  // Prints the array elements
    }
}
