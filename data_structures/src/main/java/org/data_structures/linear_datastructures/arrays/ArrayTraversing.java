package org.data_structures.linear_datastructures.arrays;

public class ArrayTraversing {
    public static void main(String args[]){

        // 1. Traversal Operation
        //This operation is performed to traverse through the array elements. It prints all array elements one after another.
        int arr[] = {1,2,3,4};
        System.out.println("elements of array");
        // Traversing array using for loop
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        // Traversing array using for each loop
        for (int i:arr) {
            System.out.println(arr[i-1]);
        }
    }

}
