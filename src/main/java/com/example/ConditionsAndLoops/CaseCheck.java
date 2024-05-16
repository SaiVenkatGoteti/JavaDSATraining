package com.example.ConditionsAndLoops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        //check if letter is capital or not

        Scanner input = new Scanner(System.in);
        /*
          * trim() is used to elemenate the extra spaces on both start and end of word
          * charAt() is used to get the first letter from the word
         */
        char ch = input.next().trim().charAt(0);
        System.out.println(ch);

        /*
         * here it checks the first character is between the a and z if it is then lower case
         * each letter will have it's numeric value based on that here condition is checking 'a' is
         */
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lower Case");
        }else{
            System.out.println("Upper Case");
        }
    }
    
}
