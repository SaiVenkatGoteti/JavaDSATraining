package com.example.ConditionsAndLoops;

import java.util.ArrayList;
import java.util.Scanner;

public class Conditions {
    public static void main(String[] args){
        //check which is max value 
        
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        
        int maxValue = a;
        if(b> maxValue){
            maxValue = b;
        }

        if(c > maxValue){
            maxValue = c;
        }

        System.out.println(maxValue);

        
    }
}
