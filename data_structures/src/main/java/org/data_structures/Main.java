package org.data_structures;

// Types of Data Structures in Java
public class Main {
    public static void main(String[] args) {
        System.out.println("**********************************");
        System.out.println("Types of Data Structures in Java :-\n 1. Primitive Data Structure\n 2. Non-Primitive Data Structure");
        String primitiveDataStructure[] = {"Integer","Float","Character","Boolean"};
        String nonPrimitiveDataStructure[] = {"LinearDataStructure","NonLinearDataStructure"};
        String linearDataStructure[] = {"Array","Linked List", "Stack","Queue"};
        String nonLinearDataStructure[] = {"Tree","Graph"};
        System.out.println("1. Primitive Data Structure :");
        for(int dataStructure=0;dataStructure<primitiveDataStructure.length;dataStructure++){
            System.out.println("\t"+primitiveDataStructure[dataStructure]);
        }
        System.out.println("2. Non-Primitive Data Structure :");
        for(int dataStructure=0;dataStructure<nonPrimitiveDataStructure.length;dataStructure++){
            if(nonPrimitiveDataStructure[dataStructure] == "LinearDataStructure"){
                System.out.println("\t"+nonPrimitiveDataStructure[0]);
                for(int linear_DataStructure =0;linear_DataStructure<linearDataStructure.length;linear_DataStructure++)
                    System.out.println("\t\t"+linearDataStructure[linear_DataStructure]);
            }
            else {
                System.out.println("\t"+nonPrimitiveDataStructure[1]);
                for (int non_Linear_DataStructure =0;non_Linear_DataStructure<nonLinearDataStructure.length;non_Linear_DataStructure++){
                    System.out.println("\t\t"+nonLinearDataStructure[non_Linear_DataStructure]);
                }
            }
        }
    }
}