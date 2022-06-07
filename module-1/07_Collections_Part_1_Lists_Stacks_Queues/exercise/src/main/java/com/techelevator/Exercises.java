package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Exercises {

	/*
	 Note, for-each is preferred, and should be used when possible.
	 */

	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order
	 array2List( {"Apple", "Orange", "Banana"} )  ->  ["Apple", "Orange", "Banana"]
	 array2List( {"Red", "Orange", "Yellow"} )  ->  ["Red", "Orange", "Yellow"]
	 array2List( {"Left", "Right", "Forward", "Back"} )  ->  ["Left", "Right", "Forward", "Back"]
	 */
	public List<String> array2List(String[] stringArray) {
		List<String> stringList = new ArrayList<String>();

		for(int i=0; i<stringArray.length; i++){
			stringList.add(stringArray[i]);
		}
		return stringList;
	}

	/*
	 Given a list of Strings, return an array containing the same Strings in the same order
	 list2Array( ["Apple", "Orange", "Banana"] )  ->  {"Apple", "Orange", "Banana"}
	 list2Array( ["Red", "Orange", "Yellow"] )  ->  {"Red", "Orange", "Yellow"}
	 list2Array( ["Left", "Right", "Forward", "Back"] )  ->  {"Left", "Right", "Forward", "Back"}
	 */
	public String[] list2Array(List<String> stringList) {
		String[] newArray = new String[stringList.size()];

		for(int i=0; i<stringList.size(); i++){
			newArray[i] = stringList.get(i);
		}

		return newArray;
	}


	/*
	 Given an array of Strings, return an ArrayList containing the same Strings in the same order
	 except for any words that contain exactly 4 characters.
	 no4LetterWords( {"Train", "Boat", "Car"} )  ->  ["Train", "Car"]
	 no4LetterWords( {"Red", "White", "Blue"} )  ->  ["Red", "White"]
	 no4LetterWords( {"Jack", "Jill", "Jane", "John", "Jim"} )  ->  ["Jim"]
	 */

	public List<String> no4LetterWords(String[] stringArray) {
		List<String> nonFourList = new ArrayList<String>();

		for(int i = 0; i < stringArray.length; i++){
			if(stringArray[i].length() != 4){
				nonFourList.add(stringArray[i]);
			}
		}
		return nonFourList;
	}

	/*
	 Given an array of ints, divide each int by 2, and return an ArrayList of Doubles.
	 arrayInt2ListDouble( {5, 8, 11, 200, 97} ) -> [2.5, 4.0, 5.5, 100, 48.5]
	 arrayInt2ListDouble( {745, 23, 44, 9017, 6} ) -> [372.5, 11.5, 22, 4508.5, 3]
	 arrayInt2ListDouble( {84, 99, 3285, 13, 877} ) -> [42, 49.5, 1642.5, 6.5, 438.5]
	 */
	public List<Double> arrayInt2ListDouble(int[] intArray) {
		List<Double> doubleList = new ArrayList<Double>();

		for(int i = 0; i < intArray.length; i++){
			double newDouble = intArray[i];

			doubleList.add(newDouble / 2);
		}

		return doubleList;
	}

	/*
	 Given a List of Integers, return the largest value.
	 findLargest( [11, 200, 43, 84, 9917, 4321, 1, 33333, 8997] ) -> 33333
	 findLargest( [987, 1234, 9381, 731, 43718, 8932] ) -> 43718
	 findLargest( [34070, 1380, 81238, 7782, 234, 64362, 627] ) -> 81238
	 */
	public Integer findLargest(List<Integer> integerList) {
		int findLarge = 0;
		for(Integer compareNum : integerList){
			if(compareNum > findLarge){
				findLarge = compareNum;
			}
			
		}
		return findLarge;
	}

	/*
	 Given an array of Integers, return a List of Integers containing just the odd values.
	 oddOnly( {112, 201, 774, 92, 9, 83, 41872} ) -> [201, 9, 83]
	 oddOnly( {1143, 555, 7, 1772, 9953, 643} ) -> [1143, 555, 7, 9953, 643]
	 oddOnly( {734, 233, 782, 811, 3, 9999} ) -> [233, 811, 3, 9999]
	 */
	public List<Integer> oddOnly(Integer[] integerArray) {
		List<Integer> oddValues = new ArrayList<Integer>();

		for(int i = 0; i < integerArray.length; i++){
			if(integerArray[i] % 2 == 1){
				oddValues.add(integerArray[i]);
			}
		}

		return oddValues;
	}

	/*
	 Given a List of Integers, and an int value, return true if the int value appears two or more times in
	 the list.
	 foundIntTwice( [5, 7, 9, 5, 11], 5 ) -> true
	 foundIntTwice( [6, 8, 10, 11, 13], 8 -> false
	 foundIntTwice( [9, 9, 44, 2, 88, 9], 9) -> true
	 */
	public boolean foundIntTwice(List<Integer> integerList, int intToFind) {
		int intToFindCounter = 0;

		for(int i = 0; i < integerList.size(); i++){
			if(intToFind == integerList.get(i)){
				intToFindCounter++;
			}
		}

		if(intToFindCounter >= 2){
			return true;
		} else {
			return false;
		}

	}

	/*
	 Given an array of Integers, return a List that contains the same Integers (as Strings). Except any multiple of 3
	must be replaced by the String "Fizz", any multiple of 5 must be replaced by the String "Buzz",
	and any multiple of both 3 and 5 must be replaced by the String "FizzBuzz."
	** INTERVIEW QUESTION **

	fizzBuzzList( {1, 2, 3} )  ->  ["1", "2", "Fizz"]
	fizzBuzzList( {4, 5, 6} )  ->  ["4", "Buzz", "Fizz"]
	fizzBuzzList( {7, 8, 9, 10, 11, 12, 13, 14, 15} )  ->  ["7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]

	HINT: To convert an Integer x to a String, you can use x.toString() in your code. For example, if x = 1, then x.toString() returns "1."
	 */
	public List<String> fizzBuzzList(Integer[] integerArray) {
		List<String> fizzBuzz = new ArrayList<String>();

		for(int i = 0; i < integerArray.length; i++){
			if(integerArray[i] % 3 == 0 && integerArray[i] % 5 == 0){
				fizzBuzz.add("FizzBuzz");
			} else if (integerArray[i] % 3 == 0){
				fizzBuzz.add("Fizz");
			} else if (integerArray[i] % 5 == 0){
				fizzBuzz.add("Buzz");
			} else {
				fizzBuzz.add(integerArray[i].toString());
			}
		}

		return fizzBuzz;
	}

	/*
	 Given two lists of Integers, interleave them beginning with the first element in the first list followed
	 by the first element of the second. Continue interleaving the elements until all elements have been interwoven.
	 Return the new list. If the lists are of unequal lengths, simply attach the remaining elements of the longer
	 list to the new list before returning it.
	 interleaveLists( [1, 2, 3], [4, 5, 6] )  ->  [1, 4, 2, 5, 3, 6]
	 */
	public List<Integer> interleaveLists(List<Integer> listOne, List<Integer> listTwo) {
		// make 2 (for loops)
		// one for matching indexes and one for the list that has remaining values while the other one is complete

		// variable for the first (for loop)'s maximum index
		int smallerListLength = Math.min(listOne.size(), listTwo.size());
		// create a new list of integers that we will return as our final result
		List<Integer> resultsList = new ArrayList<>();

		// this (for loop) will take the same index of both list given(listOne & listTwo) and feed them both
		// into our new list that we created(resultsList)
		for(int i = 0; i < smallerListLength; i++){
			// each iteration send both[i] values into resultsList
			resultsList.add(listOne.get(i));
			resultsList.add(listTwo.get(i));
		}

		// variable for the second (for loop)'s maximum index and will be the list of the remaining values from the
		// bigger list that we stopped on above.
		List<Integer> biggerList = (listOne.size() > listTwo.size()) ? listOne : listTwo;
		// this (for loop)'s index will start on the length of (smallerListLength)'s length
		for(int i = smallerListLength; i < biggerList.size(); i++){
			// this logic will continue on with the index that we stopped on in the previous (for loop) and add
			// the rest of the values to the (resultsList) from the (biggerList)
			resultsList.add(biggerList.get(i));
		}

		return resultsList;

	}

}
