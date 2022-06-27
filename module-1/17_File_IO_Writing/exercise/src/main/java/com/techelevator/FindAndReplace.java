package com.techelevator;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FindAndReplace {

    // search a word
    // search a replacement word
    // locate the source file
    // locate the destination file
    // copy and paste everything except the replacement word to the destination file

    public static void main(String[] args) {

        // "try" block userInput
        try (Scanner userInput = new Scanner(System.in)) {

            // get search word from user & store input in variable
            System.out.println("What word are you searching for?");
            String word = userInput.nextLine();
            // ensure word variable isn't empty
            if(word == null || word.isEmpty()){
                System.out.println("The word search is empty");
                System.exit(0); // end program
            }

            // get replacement word from user & store input variable
            System.out.println("What word will be the replacement");
            String replaceWord = userInput.nextLine();
            // ensure replaceWord variable isn't empty
            if(replaceWord == null || replaceWord.isEmpty()){
                System.out.println("The replacement word search is empty");
                System.exit(0); // end program
            }

            // get source file link and save the path
            System.out.println("What is the source file?");
            String path = userInput.nextLine();
            // use File class to turn the path into file
            File sourceFile = new File(path);
            // ensure file exist
            if(!sourceFile.exists()){
                System.out.println(path + " does not exist!");
                System.exit(0); // end program
            }
            //

            // get the location of the destination file and save the path
            System.out.println("What is the destination file?");
            // reuse the "path" variable and reassign it the nextLine method value
            path = userInput.nextLine();
            // use File class to turn the path into file
            File destinationFile = new File(path);
            // ensure the path isn't empty
            if(path == null || path.isEmpty()){
                System.out.println(path + " is empty");
                System.exit(0);
            }

            // create "try" block to scan sourceFile
            try (Scanner sourceScanner = new Scanner(sourceFile.getAbsoluteFile());
                 // use PrintWriter on destinationFile to allow us to access it and write on it
                 PrintWriter destinationWriter = new PrintWriter(destinationFile.getAbsoluteFile()))
            {
                // loop over the source file
                while (sourceScanner.hasNextLine()) {
                    // this allows us to read over the current line and save it in the "line" variable
                    String line = sourceScanner.nextLine();
                    // take each "line" & replace old word with new word and print it on the destinationFile
                    destinationWriter.println(line.replaceAll(word, replaceWord));
                }


            }

            // catch with standard FileNotFound message
            catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }

        }

    }

}


