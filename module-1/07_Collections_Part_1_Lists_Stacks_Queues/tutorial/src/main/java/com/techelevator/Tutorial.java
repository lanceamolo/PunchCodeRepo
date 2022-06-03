package com.techelevator;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class Tutorial {
	
    public static void main(String[] args) {

    	// Step One: Declare a List
        List<String> newList = new ArrayList<>();
    	
    	// Step Two: Add values to a List
        newList.add("Sushi");
        newList.add("Pho");
        newList.add("Kbbq");
        newList.add("Ramen");
    	
    	// Step Three: Looping through a List in a for loop
        for(int i = 0; i < newList.size(); i++){
            System.out.println(newList.get(i));
        }
    	
    	// Step Four: Remove an item
       newList.remove("Ramen");

    	
    	// Step Five: Looping through List in a for-each loop

    }

}
