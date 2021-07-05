package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// [4, 2, 8, 3, 9]


        int[] numbers = {4, 2, 8, 3, 9, 5};
        /*
        // Bubble sort
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 -i; j++) {
                if(numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j +1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));

        // Insertion sort - use indexing to sort elements

        for (int i = 0; i < numbers.length; i++) {
            int valueToSort = numbers[i];
            int j;
            for (j = i; j > 0 && numbers[j - 1] > valueToSort; j--) {
                numbers[j] = numbers[j - 1];
            }
            numbers[j] = valueToSort;
        }
        System.out.println(Arrays.toString(numbers));


        // Selection sort - find the least element in the array - swap that the minimum with current element
        for (int i = 0; i < numbers.length - 1; i++) {
            int index = i; //current index of the number
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[j] < numbers[index]) {
                    index = j; // swap if number at position j less than number ar position index
                }
            }
            int smallerNumber = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = smallerNumber;
        }
        System.out.println(Arrays.toString(numbers));
        */

        // Merge sort - divide the array into subarrays of about half size in each iteration/repetition
        // until each subarray has only one element. Merge subarray repeatedly to create sorted array. Repeating until one sorted array

        // Recursive method
        

        }

    private static void merge (int start, int mid, int end, int[] numbers) {
        // Initialize the temp Array and index
        int[] tempArray = new int[numbers.length];
        int tmpArrayIndex = start;

        // initialize start index and mid index
        int startIndex = start;
        int midIndex = mid + 1;

        // Iterate until the smaller array reaches the end
        while (startIndex <= mid && midIndex <= end) {
            if(numbers[startIndex] < numbers[midIndex]) {
                tempArray[tmpArrayIndex++] = numbers[startIndex++];
            } else {
                tempArray[tmpArrayIndex++] = numbers[midIndex++];
            }
        }
        while (startIndex <= mid) {
            tempArray[tmpArrayIndex] = numbers[startIndex];
        }
        while (midIndex <= end) {
            tempArray[tmpArrayIndex++] = numbers[midIndex++];
        }
        //copy temporary array to the actual array after sorting
        if(end + 1 - start >= 0) {

            System.arraycopy(tempArray, start, numbers, start, end + 1 - start);
        }
    }
}
