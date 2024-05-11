package com.cbfacademy.sort;

public class QuickSort implements ArraySorter {

    // Sorts the input array from startIndex to endIndex using Quick Sort
    public void sort(int[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            // Partition the array around a pivot element
            int pivotIndex = partition(arr, startIndex, endIndex);

            // Recursively sort the left and right partitions
            sort(arr, startIndex, pivotIndex - 1);
            sort(arr, pivotIndex + 1, endIndex);
        }
    }

    // Partitions the array and returns the pivot index
    int partition(int[] arr, int startIndex, int endIndex) {
        // Choose the rightmost element as the pivot
        int pivot = arr[endIndex];
        int boundaryIndex = startIndex - 1; // Initialize boundary for lower partition

        // Iterate through elements (except pivot)
        for (int currentIndex = startIndex; currentIndex < endIndex; currentIndex++) {
            if (arr[currentIndex] <= pivot) {
                // Increment boundary and swap current element with boundary element
                boundaryIndex++;
                swap(arr, boundaryIndex, currentIndex);
            }
        }

        // Move pivot to its final position
        swap(arr, boundaryIndex + 1, endIndex);
        return boundaryIndex + 1; // Pivot index
    }

    private void swap(int[] arr, int boundaryIndex, int currentIndex) {
        // TODO Auto-generated method stub

    }

}
