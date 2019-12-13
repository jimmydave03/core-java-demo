package com.example.demo;


public class PrimeNumber {
	
	public void checkPrimeNumber(int num) {
		
		boolean result = true;
		
		int temp = 0;
		for(int i = 2; i <= (num / 2); i++) {
			temp = num % i;
			if(temp == 0) {
				result = false;
				break;
			}
		}
		System.out.println(result);
		
	}
	
	public void printPrimeNumbers(int num) {
		
		for(int j = 0; j <= num; j++) {
			int temp = 0;
			for(int i = 2; i <= (j / 2); i++) {
				temp = j % i;
				if(temp == 0) {
					break;
				}
			}
			
			if(temp != 0) {
				System.out.print(j + " ");
			}
			if(j == 3) {
				System.out.print(j + " ");
			}
			if(j == 2) {
				System.out.print(j + " ");
			}
		}
		
	}
	
	public static void main(String[] args) {
		PrimeNumber demo1 = new PrimeNumber();
		demo1.checkPrimeNumber(3);
		demo1.printPrimeNumbers(100);
	}

}
