package org.data_structures.linear_datastructures.arrays;

// Array
// Arrays are defined as the collection of similar types of data items stored at contiguous memory locations.
// It is one of the simplest data structures where each data element can be randomly accessed by using its index number.
public class ArrayDeclarations {
    public static void main(String args[]){
        //Syntax to Declare an Array in Java
        // 1. dataType[] arr;
        int[] arr;         //(or)
        //dataType []arr;
        int []arr1;        //(or)
        //dataType2 arr[];
        int arr3[];
        // Instantiation of an Array in Java
        //arrayRefVar=new datatype[size];
        arr = new int[5];
        // Method 1
        int array[]={33,3,4,5};//declaration, instantiation and initialization
        // Method 2
        int array1[] = new int[5]; // declaration and instantiation
        array1[0] = 12; //initialization
        array1[1] = 13;
        array1[2] = 14;
        array1[3] = 15;
        array1[4] = 16;
        for(int number=0;number<array1.length;number++){
            System.out.println(array1[number]);
        }
    }
}