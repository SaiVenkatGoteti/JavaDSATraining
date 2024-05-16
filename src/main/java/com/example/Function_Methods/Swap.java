package com.example.Function_Methods;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        /*
        here we're trying to swap the name value
        name is a reference variable pointing to "sai" which is value(object)
        while passing copy of name value as parameter, in the swap naam is a copy of name so it points to same value
        "sai"
        even if we change the value of naam it won't change the main value "sai"
         */
        String  name ="Sai";
        swap(name);
        System.out.println(name);

        /*
        example for another swap using arrays. arrays are worked based on index, we can modify the values in a
        array using index.

        Array is non-primitive type which means the varibale which refers the value stored in heap memory
        Array is collection of data either it can be int, string, flot, long etc.

        here arr is array variable and it reffering to {2,5,3,66} value.
        we're passing copy of arr value as parameter to changeValue method.
        in that method we're updating the 0th index value to 99. as arr1 value is a copy of arr, so it refers the same value
        as arr. if we change the arr1 then arr value also changes.
         */
        int[] arr = {2,5,3,66};
        changeValue(arr);
        /*
        here we're using Arrays.toString() because if we print array directly it will return in object format, so we're
        asking to print in string format.
         */
        System.out.println(Arrays.toString(arr));
    }

    static void changeValue(int[] arr1) {
        arr1[0] = 99;
    }

    static void swap(String naam){
        naam ="venkat";
    }
}
