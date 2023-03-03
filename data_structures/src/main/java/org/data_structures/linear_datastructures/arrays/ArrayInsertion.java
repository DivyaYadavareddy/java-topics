package org.data_structures.linear_datastructures.arrays;

import java.util.Scanner;
import java.util.Scanner;  // Import the Scanner class
public class ArrayInsertion {
    static int arrayInsertionAtEnd(int array[], int size, int insertionIndex, int insertionElement){
        if(insertionIndex>= size)
            return insertionIndex;
        array[insertionIndex]=insertionElement;
        return (insertionIndex+1);
    }
    static int arrayInsertionAtSpecificPosition(int arr[],int size,int insertionIndex,int insertionElement){
        if(insertionIndex>=size)
            return insertionIndex;
        arr[insertionIndex] = insertionElement;
        return (insertionIndex+1);
    }
    public static void main(String args[]){
        Scanner myObject = new Scanner(System.in);// Create a Scanner object
        System.out.println("Enter Size of the array");
        int size = myObject.nextInt();  // Read user input array size
        System.out.println("Enter insertion_element of the array");
        int insertion_element = myObject.nextInt();
        System.out.println("Enter insertion_index of the array");
        int insertion_index = myObject.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements of the array");
        for(int index=1;index<=4;index++){
            arr[index]=myObject.nextInt();
        }
        System.out.println("before insertion:");
        for (int index=0;index<insertion_index;index++) {
            System.out.println(arr[index]);
        }
        // Insert an element at the end
        insertion_index= arrayInsertionAtEnd(arr,size,insertion_index,insertion_element);

        System.out.println("After Insertion:");
        for (int index=0; index<insertion_index;index++) {
            System.out.println(arr[index]);
        }
    }
}
