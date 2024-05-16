package com.example.Function_Methods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //sum();
        //int result = sum2();
        //System.out.println(result);
        
        String msg = myGreeting();
        System.out.println(msg);
    }

    static String myGreeting() {
        return "Hello world";
    }

    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = input.nextInt();

        System.out.println("Sum of two values: "+( num1+ num2));
    }

    static int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = input.nextInt();
        return num1+num2;
    }
}


