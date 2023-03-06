package org.example;
// Types of variables in java
public class TypesOFVariablesExample {
    public static void main(String args[]){
        //Create Variables in Java
        int speedLimit = 80;
        // or
        //You can declare variables and assign variables separately. For example,
        int speed;
        speed = 80;
        // Note: Java is a statically-typed language. It means that all variables must be declared before they can be used.

        // Change values of variables
        int speedOfLight = 80;
        speedOfLight = 90;
        System.out.println(speedOfLight);

        // we cannot change the data type of variable in Java within the same scope.
        int speedOfAir ;
        //float speedOfAir = 5;   we can't do this

        //Java is case-sensitive. Hence, age and AGE are two different variables. For example,

        int age = 24;
        int AGE = 25;

        System.out.println(age);  // prints 24
        System.out.println(AGE);  // prints 25
        //Variables must start with either a letter or an underscore, _ or a dollar, $ sign. For example,

        //int age;  // valid name and good practice
        int _age;  // valid but bad practice
        int $age;  // valid but bad practice
        //Variable names cannot start with numbers. For example,
        //int 1age;  // invalid variables

        //Variable names can't use whitespace. For example,

        //int my age;  // invalid variables

    }
}
