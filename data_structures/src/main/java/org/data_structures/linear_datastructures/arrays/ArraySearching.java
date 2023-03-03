package org.data_structures.linear_datastructures.arrays;

public class ArraySearching {
    public static void main(String args[]){
        // 2. Search Operation:
        //In an unsorted array, the search operation can be performed by linear traversal from the first element to the last element.
        int array[] = {1,2,3,4,5};
        int searchElement = 6;
        // calling findElementInGivenArray method
        int position = findElementInGivenArray(array,5,searchElement);
        if(position == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at Position:"+(position+1));
        //Time Complexity: O(N)
        //Auxiliary Space: O(1)
    }
    static int findElementInGivenArray(int array[], int size, int search_element){
        for(int element=0;element<size;element++){
            if(array[element]==search_element){
                return element;
            }
        }
        //if the key is not found
        return -1;
    }
}
