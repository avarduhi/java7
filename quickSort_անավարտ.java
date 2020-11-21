package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {2, 1, 7, 4, 8, 3, 6, 5};
        quickSort(arr, arr[0], arr[arr.length-1] );
        System.out.println(Arrays.toString(arr));

    }
    static void quickSort(int arr[], int low, int high){
        int pi;

        if(low < high) {
            pi = partition(arr, low, high);
            quickSort(arr, arr[0], pi - 1);
            quickSort(arr, pi + 1, arr[arr.length-1]);
        }
    }

    static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;
        int temp;

        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp = arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
}
