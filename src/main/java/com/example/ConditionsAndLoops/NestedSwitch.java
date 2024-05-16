package com.example.ConditionsAndLoops;

import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		String department = input.next();

        switch (num) {
            case 1 -> System.out.println("Sai");
            case 2 -> System.out.println("Venkat");
            case 3 -> {
                System.out.println("inside employe 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "HR" -> System.out.println("HR department");
                    default -> System.out.println("Enter valid department name");
                }
            }
            default -> System.out.println("Enter valid empId");
        }
	}

}
