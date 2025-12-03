package arrayandstring;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        // Array before sorting
        int a[] = {4, 2, 1, 5, 3};
        System.out.println("Array Before Sorting: " + Arrays.toString(a));

        int n = a.length;  // size of the array

        // Outer loop → number of passes (n-1 passes)
        for (int i = 0; i < n - 1; i++) {

            // Inner loop → compares adjacent elements
            for (int j = 0; j < n - 1; j++) {

                // If current element is greater than next element → swap
                if (a[j] > a[j + 1]) {
                    int temp = a[j];      // store current value
                    a[j] = a[j + 1];      // move next value to current position
                    a[j + 1] = temp;      // put old current value to next position
                }
            }
        }

        // Array after sorting
        System.out.println("Array After Sorting: " + Arrays.toString(a));
    }
}