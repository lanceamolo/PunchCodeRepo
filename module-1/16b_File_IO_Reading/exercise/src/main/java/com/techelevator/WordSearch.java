package com.techelevator;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordSearch {

	public static void main(String[] args) {

		// create "try" block that reads userInput with System.in from Scanner
		try (Scanner userInput = new Scanner(System.in)) {

			// Ask the user for the file path
			System.out.println("What is the file path?");
			// Store the user's input in a variable
			String path = userInput.nextLine();
			// Take the input and save it as a File
			File inputFile = new File(path);

			// Create error message if file does NOT exist
			if (!inputFile.exists()) {
				System.out.println("File does NOT exist");
				System.exit(1); // Ends the program
			}
			// Create error message if given path is NOT a file
			if (!inputFile.isFile()) {
				System.out.println("This is NOT a file");
				System.exit(1); // Ends the program
			}

			// Get the search word from the user
			System.out.println("What is the word you're searching for?");
			// Store user's word in a variable
			String searchWord = userInput.nextLine();

			// Create error message if searchWord does NOT exist or is empty
			if ((searchWord == null) || (searchWord.isEmpty())) {
				System.out.println("The word either does not exist here or is empty");
				System.exit(1); // Ends the program
			}

			// Ask if the search should be case-sensitive
			System.out.println("Should the search be case sensitive? (Y\\N)");
			boolean caseSensitive = userInput.nextLine().toLowerCase().equals("y");

			// Perform word search
			// Start line number at 1
			int lineNumber = 1;
			// create "try" block that runs getAbsoluteFile method on the saved inputFile variable
			try (Scanner inputScanner = new Scanner(inputFile.getAbsoluteFile())){
				// run hasNextLine method to read each line from the given file
				while (inputScanner.hasNextLine()) {
					// save current line in a variable
					String line = inputScanner.nextLine();
					// check to see if it's case-sensitive
					if (caseSensitive == false) {
						// if case-sensitive, run toLowerCase method & run contains method with the searchWord variable
						if (line.toLowerCase().contains(searchWord.toLowerCase())) {
							// display the line number plus the contents of the line itself
							System.out.println(lineNumber + ") " + line);
						}
					}
					else {
						// this is ran if the caseSensitive was true
						if (line.contains(searchWord)) {
							// display the line number plus the contents of the line itself
							System.out.println(lineNumber + ") " + line);
						}
					}
					// this will keep our while loop running until inputScanner.hasNextLine reads false
					lineNumber += 1;
				}
				// set up catch if "try" doesn't run for inputScanner
			} catch (FileNotFoundException e) {
				// use "e" parameter to with getMessage method to display error message
				System.out.println(e.getMessage());
			}
		}
	}
}


