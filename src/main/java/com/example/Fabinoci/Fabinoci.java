package com.example.Fabinoci;

import java.util.Scanner;

public class Fabinoci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0;
        int b=1;
        int n=input.nextInt();
        int result=0;

        for (int i = 2; i <= n; i++) {
            result =a+b;
            a=b;
            b=result;
        }

        System.out.println(result);
    }
}