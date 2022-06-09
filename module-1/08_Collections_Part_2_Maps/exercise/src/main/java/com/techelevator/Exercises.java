package com.techelevator;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Exercises {

	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "Herd".
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * animalGroupName("Rhino") -> "Crash"
	 * animalGroupName("rhino") -> "Crash"
	 * animalGroupName("elephants") -> "unknown"
	 *
	 */
	public String animalGroupName(String animalName) {
		Map<String, String> animals = new HashMap<String, String>();
		animals.put("rhino", "Crash");
		animals.put("giraffe", "Tower");
		animals.put("elephant", "Herd");
		animals.put("lion", "Pride");
		animals.put("crow", "Murder");
		animals.put("pigeon", "Kit");
		animals.put("flamingo", "Pat");
		animals.put("deer", "Herd");
		animals.put("dog", "Pack");
		animals.put("crocodile", "Float");


		if (animalName != null && animals.containsKey(animalName.toLowerCase())) {
			return animals.get(animalName.toLowerCase());
		} else {
			return "unknown";
		}

	}

	/*
	 * Given a String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 *
	 * If the item number is empty or null, return 0.00.
	 *
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 *
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00
	 *
	 */
	public double isItOnSale(String itemNumber) {
		Map<String, Double> sales = new HashMap<String, Double>();

		sales.put("KITCHEN4001", 0.20);
		sales.put("GARAGE1070", 0.15);
		sales.put("LIVINGROOM", 0.10);
		sales.put("KITCHEN6073", 0.40);
		sales.put("BEDROOM3434", 0.60);
		sales.put("BATH0073", 0.15);

		// create (key) variable to check to see if parameter is null or not to allow toUpperCase to work
		String key = itemNumber == null ? "" : itemNumber.toUpperCase();
		// check to see if (key) variable is existing in Map
		if (sales.containsKey(key)) {
			// if it does, return the value with the matching key
			return sales.get(key);
		} else {
			return 0.0;
		}

	}

	/*
	 * Modify and return the given Map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 *
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 *
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 *
	 */

	// if Peter's money > 0 && Paul's money < $10 return Peter gives half to Paul

	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		int petersMoney = peterPaul.get("Peter");
		int paulsMoney = peterPaul.get("Paul");

		if(petersMoney > 0 && paulsMoney < 1000){
			int moneyTransfer = petersMoney / 2;

			peterPaul.put("Peter", petersMoney - moneyTransfer);
			peterPaul.put("Paul", paulsMoney + moneyTransfer);
		}

		return peterPaul;

	}

	/*
	 * Modify and return the given Map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 *
	 * peterPaulPartnership({"Peter": 50000, "Paul": 100000}) → {"Peter": 37500, "Paul": 75000, "PeterPaulPartnership": 37500}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 *
	 */

	// if petersMoney >= 5000 && paulsMoney >= 10000 then create new PPPartnership 25% of both


	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		int petersMoney = peterPaul.get("Peter");
		int paulsMoney = peterPaul.get("Paul");

		if(petersMoney >= 5000 && paulsMoney >= 10000){
			int petersShare = petersMoney / 4;
			int paulsShare = paulsMoney / 4;
			int petersNew = petersMoney - petersShare;
			int paulsNew = paulsMoney - paulsShare;

			peterPaul.put("Peter", petersNew);
			peterPaul.put("Paul", paulsNew);
			peterPaul.put("PeterPaulPartnership", petersShare + paulsShare);

		}

		return peterPaul;

	}

	/*
	 * Given an array of non-empty Strings, return a Map<String, String> where for every different String in the array,
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map<String, String> beginEnd = new TreeMap<String, String>();

		for(String word : words){
			String first = word.substring(0, 1);
			String second = word.substring(word.length() - 1);

			beginEnd.put(first, second);
		}

		return beginEnd;
	}

	/*
	 * Given an array of Strings, return a Map<String, Integer> with a key for each different String, with the value the
	 * number of times that String appears in the array.
	 *
	 * ** A CLASSIC **
	 *
	 * wordCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 *
	 */
	public Map<String, Integer> wordCount(String[] words) {
		Map<String, Integer> wordCounter = new HashMap<String, Integer>();

		// this condition will return a empty Map since our array is empty
		if(words == null){
			return wordCounter;
		} else {
			// set up loop to read over whole array. "word" will represent each index
			for(String word : words){
				// this condition will check to see if the "word" is already existing within (wordCounter) Map
				if(wordCounter.containsKey(word)){
					// if it DOES exist, add 1 to the value
					wordCounter.put(word, wordCounter.get(word) + 1);
				} else {
					// if it DOES NOT exist, create a new key with "word" and start it with a value of 1
					wordCounter.put(word, 1);
				}
			}

			return wordCounter;
		}

	}

	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the
	 * number of times that int appears in the array.
	 *
	 * ** The lesser known cousin of the the classic wordCount **
	 *
	 * intCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 2, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * intCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * intCount([]) → {}
	 *
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map<Integer, Integer> intCounter = new HashMap<Integer, Integer>();

		if(ints == null){
			return intCounter;
		} else {
			for(Integer num : ints){
				if(intCounter.containsKey(num)){
					intCounter.put(num, intCounter.get(num) + 1);
				} else {
					intCounter.put(num, 1);
				}
			}

			return intCounter;
		}

	}

	/*
	 * Given an array of Strings, return a Map<String, Boolean> where each different String is a key and value
	 * is true only if that String appears 2 or more times in the array.
	 *
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 *
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		Map<String, Boolean> multipleStr = new HashMap<String, Boolean>();

		for(String word : words){
			if(multipleStr.containsKey(word)){
				multipleStr.put(word, true);
			} else {
				multipleStr.put(word, false);
			}
		}

		return multipleStr;

	}

	/*
	 * Given two Maps, Map<String, Integer>, merge the two into a new Map, Map<String, Integer> where keys in Map2,
	 * and their int values, are added to the int values of matching keys in Map1. Return the new Map.
	 *
	 * Unmatched keys and their int values in Map2 are simply added to Map1.
	 *
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 *
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse,
			Map<String, Integer> remoteWarehouse) {

		Map<String, Integer> combineWarehouse = new HashMap<String, Integer>();

		return combineWarehouse;


	}

	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of Strings, for each String, the count of the number of times that a subString length 2 appears
	 * in the String and also as the last 2 chars of the String, so "hixxxhi" yields 1.
	 *
	 * We don't count the end subString, but the subString may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end subString, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is String from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */



	public Map<String, Integer> last2Revisited(String[] words) {
		// create new map to return results
		Map<String, Integer> results = new HashMap<String, Integer>();

		for(String word : words){
			// create count variable for the value of each string
			int counter = 0;
			// create variable to hold the last 2 chars of each string
			String lastTwoChar = word.substring(word.length() - 2);

			for(int i = 0; i < word.length() - 2; i++){
				// if statement that adds 1 to (counter) variable if (lastTwoChar) variable shows up in each iteration of the for loop
				// code goes here
				if(word.substring(i, i + 2).equals(lastTwoChar)){
					counter++;
				}
			}

			results.put(word, counter);
		}

		return results;

	}

}
