package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the length: ");
		String lengthInput = userInput.nextLine();
		int length = Integer.parseInt(lengthInput);

		System.out.print("Is the measurement in (m)eter, or (f)eet?: ");
		String metricInput = userInput.nextLine();

		//m = f * 0.3048 feet to meters
		//f = m * 3.2808399 meters to feet
		//58f is 17m.

		if("f".equals(metricInput)){
			int meterConvert = (int) (length * 0.3048);
			System.out.println(length + metricInput + " is " + meterConvert + "m.");
		} else if ("m".equals((metricInput))){
			int feetConvert = (int) (length * 3.2808399);
			System.out.println(length + metricInput + " is " + feetConvert + "f.");
		} else {
			System.out.println("Input is invalid. Please try again!");
		}

	}

}
