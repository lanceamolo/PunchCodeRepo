package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Please enter a number: ");
		String userNumber = userInput.nextLine();
		int limitNum = Integer.parseInt(userNumber);
		// starting print of "0, 1,"
		System.out.print("0, 1");

		int trailingNum = 1;
		int leadingNum = 1;

		// while loop starts with 1 + 1 = 2 and keeps running until the leading number is equal limit number
		while(leadingNum <= limitNum){
			//this print will add onto the starting print and will continue on with "0, 1, 1"
			System.out.print(", " + leadingNum);
			//this variable will be the sum of trailing and leading numbers
			int sum = trailingNum + leadingNum;
			//reassign the value of the trailing number to the leading number
			trailingNum = leadingNum;
			//reassigns the value of the leading number to sum and allows the for loop to iterate again
			leadingNum = sum;
		}
	}

}
