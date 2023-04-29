package com.bl.Algorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {78,28,60,61,80};

        insertionSort(arr);
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for (int j: arr){
            System.out.print(j + " ");
        }
    }

    public static void insertionSort(int[] arr){
        int key;
        int j=0;

        for (int i =1; i< arr.length; i++){
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1]=key;
            }
        }
    }
