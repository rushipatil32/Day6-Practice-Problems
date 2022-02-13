package com.java.logicalproblems;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void checkPerfect() {
		int i,  value = 0 ;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(" Please Enter The Number: ");
			int number = sc.nextInt();
			
			for(i = 1 ; i < number ; i++) {
				if(number % i == 0)  {
					value = value + i;
				}
			}
			
			if (value == number) {
				System.out.println(+number+" is a Perfect Number");
			}
			else {
				System.out.println(+number+ " is not a Perfect Number");
			}
		}
		
	}
	
	public static void main(String[] args) {
		checkPerfect();
	}

}