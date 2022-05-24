package Day62_AlgorithmsAndBigONotation;

import java.util.Arrays;

public class QuickSort {
    
    public static void main(String[] args) {
        
    int N = 9;
    int arr[] = { 2, 1, 6, 10, 4, 1, 3, 9, 7};

    System.out.println("Before QuickSort: ");
    System.out.println(Arrays.toString(arr));

    quicksort(arr, 0, arr.length - 1);
    
    System.out.println("After QuickSort: ");
    System.out.println(Arrays.toString(arr));
}

    private static void quicksort(int arr[], int low, int high) {
        
        if (low >= high) {
            return;
        }

        int pivot = arr[high];
        int leftPointer = low;
        int rightPointer = high;

    while(leftPointer < rightPointer) {
        while(arr[leftPointer] <= pivot && leftPointer < rightPointer) {
            leftPointer++;
    }
        while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
            rightPointer--;
    }

    swap(arr, leftPointer, rightPointer);

    }
    swap(arr, leftPointer, high);

    quicksort(arr, low, leftPointer -1);

    quicksort(arr, leftPointer +1, high);
}

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}