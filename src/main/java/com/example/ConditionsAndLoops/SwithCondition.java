package com.example.ConditionsAndLoops;

import java.util.Scanner;

public class SwithCondition {
    public static void main(String[] args) {

        /*
         * if break is not provide after case it will execute the below reamaining cases.
         */
            
        String fruit = "Apple";
        switch (fruit) {
            case "Orange":
                System.out.println("it is orange");
                break;
            case "Apple":
                System.out.println("it is apple");
                break;
            default:
                System.out.println("Please enter valid");
        }

        /*
        * Advanced switch statement
        */

        switch (fruit) {
        case "Apple" -> System.out.println("Red fruit");
        default -> System.out.println("Enter valid fruit name");
        }
        
        int day=6;
        switch (day) {
        case 1 -> System.out.println("Monday");
        case 2 -> System.out.println("Tuesday");
        default -> System.out.println("Enter valid weekday number");
        }
        
        /*
         *Another example 
         */
        switch (day) {
        case 1,2,3,4,5 -> System.out.println("WeekDay");
        default -> System.out.println("WeekEnd");
        }
        
    }
}
