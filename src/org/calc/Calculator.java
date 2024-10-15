package org.calc;

import java.util.Scanner;

public class Calculator {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Welcome to perform Calculation");
		System.out.println("To perform Addition(+) press 1");
		System.out.println("To perfrom Subtraction (-) press 2");
		System.out.println("To perform multiplication (*) press 3");
		System.out.println("To perform division (/) press 4");
		
		System.out.println("Enter your choice of Operants(1/2/3/4)");
		int choice = s.nextInt();
		
		System.out.println("Enter the number Num1:");
		int Num1= s.nextInt();
		System.out.println("Enter the number Num2");
		int Num2 = s.nextInt();
		
		int result=10;
		
		switch (choice) {
		case 1:{
			result=Num1+Num2;
			System.out.println("Result=" +Num1+ "+" +Num2+ "="+result);
		}
			break;
		case 2:{
			result=Num1-Num2;
				System.out.println("Result=" +Num1+ "-" +Num2+ "="+result);
		}
		break;
		case 3:{
			result=Num1*Num2;
			System.out.println("Result=" +Num1+ "-" +Num2+ "="+result);
		}
		break;
		case 4:
			if(Num2!=0) {
				result=Num2/Num1;
				System.out.println("Result=" +Num1+ "/" +Num2+ "=" +result);
			}
			else {
				System.out.println("Error: This is not possible");
			}
		break;
		default:
			System.out.println("Invalid Selection");
		}
		s.close();
	}
}
