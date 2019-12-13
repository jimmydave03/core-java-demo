package com.example.demo;

public class FibbonaciSeries {
	
	public static void main(String[] args) {
		FibbonaciSeries demo1 = new FibbonaciSeries();
		demo1.runMethod(15);
	}
	
	public void runMethod(int num) {
		
		int a=0,b=0,c=1;
		
		//OUTPUT: 0,1,1,2,3,5,8,13....
		for(int i=0; i<num; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.print(a + " ");
		}
		
	}
}

