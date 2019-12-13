package com.example.demo;

public class SecondHighestNumber {
	
	public static void main(String[] args) {
		SecondHighestNumber demo1 = new SecondHighestNumber();
		int arr[] = {5, 2, 12, 1, 8};
		demo1.runMethod(arr);
	}
	
	public void runMethod(int[] arr) {
		int temp=0;
		int temparr[] = new int[arr.length]; 
		//OUTPUT: 12
		for(int i=0; i<arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = temparr[j];
					temparr[i] = temparr[j];
					temparr[j] = temp;
				}
			}
			//temparr[i] = temp;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(temparr[i] + " ");
		}
		System.out.println(arr[temparr.length - 1]);
	}
	
}
