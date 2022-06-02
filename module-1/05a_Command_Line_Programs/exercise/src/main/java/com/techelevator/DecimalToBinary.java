package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.print("Please enter in a series of decimal values (separated by spaces): ");
		String valueInput = userInput.nextLine();

		String[] numbersArr = valueInput.split(" ");


		// binary = (decimal % 2) + binary;
		for (int i = 0; i < numbersArr.length; i++) {
			int decimal = Integer.parseInt(numbersArr[i]);

			String binary = "";
			for (; decimal >= 0; decimal = decimal / 2) {
				binary = (decimal % 2) + binary;
				if (decimal == 0) {
					break;
				}

			}
			System.out.println(numbersArr[i] + " in binary is " + binary);

		}

	}
}
