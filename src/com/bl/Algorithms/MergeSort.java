package com.bl.Algorithms;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {78,28,60,61,80};
        int start = 0;
        int end = arr.length - 1;

        printArray(arr);
        mergeSort(arr, start, end);
    }

    public static void printArray(int[] arr) {

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int p = start;
        int q = mid + 1;

        int[] newArray = new int[end - start + 1];

        int j = 0;

        for (int i = start; i <= end; i++) {
            if (p > mid)
                newArray[j++] = arr[q++];
            else if (q > end)
                newArray[j++] = arr[p++];
            else if (arr[p] < arr[q])
                newArray[j++] = arr[p++];
            else
                newArray[j++] = arr[q++];
        }
        for (int k = 0; k < j; k++) {
            arr[start++] = newArray[k];
        }
    }
}
