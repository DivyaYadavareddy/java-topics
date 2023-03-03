package org.data_structures.primitive_dataStructure;

//Primitive Data Structures: A primitive data structure can store the value of only one data type. For example, a char data structure (a primitive data structure) can store only characters.
//
//        Key features of a primitive data structure:
//
//        The size of a primitive data structure is known as it can store can only one data type.
//        The primitive data structure will always store some data. It cannot contain the NULL value.
//        Examples of the primitive data type are integer, character, boolean, float, double, long, etc
public class primitiveDataStructure {
    public static void main (String args[]){
        // Primitive data structures declaration
        boolean isOpen = true; // 1 Byte
        byte systemMemory = 1; // 1 Byte
        char startingLetterOfName = 'a'; // 2 Bytes
        int age =22; // 4 Bytes
        float number = 20.25F; //4 Bytes
        double radius = 4.52d; // 8 Bytes
        long annualSalary = 2555555;
        short monthSalary = 12345;
        // Data Type
        String dataType[] ={"DataType","boolean ","byte ","char ","int  ","float ","double ","long ","short "};
        // Size in 64-bit compilers {size in bytes}
        String size[] = {"Size"," 1  "," 1  "," 2  "," 4  "," 4  "," 8  "," 8  "," 2  "};
        String range[] = {"Range","trueOrFalse"," -128To127"," 0To2^16-1"," -2^31To2^31-1","- 3.4E+38 to +3.4E+38"," -1.7E+308 to +1.7E+308"," -2^63To2^63-1"," -2^15To2^15-1"};
        for(int i=0;i< size.length;i++){
            System.out.println('\n'+dataType[i]+'\t'+size[i]+'\t'+range[i]);
        }
    }
}
