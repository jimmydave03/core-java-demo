package com.example.demo;

public class SwapTwoNumbers {
	
	public void usingThirdVariable(int num1, int num2) {
		
		int temp = 0;
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("Num1: " + num1 + " : " + "Num2: "+ num2);
	}
	
	public void withoutUsingThirdVariable(int num1, int num2) {
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("Num1: " + num1 + " : " + "Num2: "+ num2);
	}
	
	public static void main(String[] args) {
		SwapTwoNumbers demo1 = new SwapTwoNumbers();
		demo1.usingThirdVariable(20, 10);
		demo1.withoutUsingThirdVariable(20, 10);
	}
	
}
