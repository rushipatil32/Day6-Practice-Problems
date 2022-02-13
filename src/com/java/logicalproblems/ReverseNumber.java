package com.java.logicalproblems;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void reverseNumber() {
		int Number, Reminder, Reverse = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("\n Please Enter any Number you want to Reverse : ");
		Number = sc.nextInt();

		while(Number > 0) {
			Reminder = Number %10;
			Reverse = Reverse * 10 + Reminder;
			Number = Number /10;
		}
		System.out.format("\n Reverse of entered number is = %d\n", Reverse);
		sc.close();
	}
	public static void main(String[] args) {
		reverseNumber();

	}

}

