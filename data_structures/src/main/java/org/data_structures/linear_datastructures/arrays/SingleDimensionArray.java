package org.data_structures.linear_datastructures.arrays;

// Array
// Arrays are defined as the collection of similar types of data items stored at contiguous memory locations.
// It is one of the simplest data structures where each data element can be randomly accessed by using its index number.
public class SingleDimensionArray {
    public static void main(String args[]){
        int array[] = {1,2,3};
        for(int number=0;number<array.length;number++){
            System.out.println("single dimensional array :"+array[number]);
        }
    }
}
