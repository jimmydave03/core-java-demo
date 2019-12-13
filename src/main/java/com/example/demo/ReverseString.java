package com.example.demo;

public class ReverseString {
	
	public void runMethod() {
		String str = "Jimmy J Dave";
		
		String result = "";
		while(str.length() > 0) {
			
			char temp = str.charAt(str.length() - 1);
			result = result.concat(temp+"");
			str = str.substring(0, str.length() - 1);
			
		}
		
		System.out.println("res: "+result);
	}
	
	public void runMethod1() {
		String str = "Jimmy J Dave";
		
		char[] chararr = str.toCharArray();
		
		String result = "";
		for(int i = chararr.length - 1; i >= 0; i--) {
			//System.out.println(chararr[i]);
			result = result.concat(chararr[i] + "");
		}
		
		System.out.println("res: "+result);
	}
	
	public static void main(String[] args) {
		ReverseString demo1 = new ReverseString();
		demo1.runMethod();
		demo1.runMethod1();
		demo1.checkPalidromString("lola lol");
		demo1.checkPalidromNumber(12121);
	}

	private void checkPalidromString(String str) {
		String temp = "";
		char[] temparr = str.toCharArray();
		for(int i=temparr.length - 1; i >= 0; i--) {
			temp = temp.concat(temparr[i] + "");
		}
		
		if(temp.equalsIgnoreCase(str)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	private void checkPalidromNumber(int num) {
		int result = 0;
		int sum = 0;
		
		int temp = num;
		while(num > 0) {
			result = num % 10;
			sum = (sum *10) + result;
			num = num / 10;
		}
		
		if(temp == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
}
