package com.example;

public class TypeCasting {
    public static void main(String[] args) {
        /*
        int is smaller than flot so we can't assign float to int
        so we are casting (int) to float value so the float will compress and convert into int
        ex: float 56.7 output int 56
        */
        int num = (int)56.998F;
        int a =8;
        for (int i = 0; i < a; i++) {
            System.out.println(i);
        }
        
    }
}
