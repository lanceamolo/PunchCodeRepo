package com.techelevator;

public class Exercise02_BoardingGate {
    /*
    Local Jetways is a regional airline operating at local airports.
    They use a basic passenger manifest to represent seat occupancy on their plane.
        Each passenger seat is represented as an element in a boolean array.
        A value of TRUE indicates that seat is currently available.
        A value of FALSE indicates the seat is not available.
     */

    /*
    A nearby airport has an incoming flight from Local Jetways. As the passengers disembark, the gate
    attendant's first responsibility is to generate a new seating chart with each seat initially available.

    Implement the logic to generate a seating chart using the required number of seats. Make sure to indicate
    that each seat is initially available (TRUE).

    Note: The number of seats is guaranteed not to be negative.

    Examples:
    generateSeatingChart(7) → [true, true, true, true, true, true, true]
    generateSeatingChart(5) → [true, true, true, true, true]
    generateSeatingChart(2) → [true, true]
     */
    // create a new array and fill that array with the boolean value true based off of numberOfSeats
    public boolean[] generateSeatingChart(int numberOfSeats) {
        boolean[] openSeatCount = new boolean[numberOfSeats];


        for(int i = 0; i < openSeatCount.length; i++){
            openSeatCount[i] = true;
        }
        return  openSeatCount;
    }

    // generateSeatingChart(7)
    // openSeatCount = [empty, empty, empty, empty, empty, empty, empty]
    // openSeatCount = [true, empty, empty, empty, empty, empty, empty]
    // openSeatCount = [true, true, empty, empty, empty, empty, empty]
    // ....
    // openSeatCount = [true, true, true, true, true, true, true]

    /*
    Once passengers begin boarding the plane, gate attendants need a way to determine how many available
    seats there are on the plane.

    Using the array provided, implement the logic to count the number of available seats in the seating chart.
    A seat is available if the value is TRUE.

    Examples:
    getAvailableSeatCount([true, false, false, false]) → 1
    getAvailableSeatCount([false, false, false, false, false, false]) → 0
    getAvailableSeatCount([true, true, true, false]) → 3
    getAvailableSeatCount([]) → 0
     */
    public int getAvailableSeatCount(boolean[] seatingChart) {

        int trueCount = 0;

        for(int i = 0; i < seatingChart.length; i++){
            if(seatingChart[i] == true){
                trueCount++;
            }
        }
        return trueCount;
    }

    /*
    The crew determined that it would be nice to know how many rows on the plane are at full occupancy.
    Each row has three seats and a row is at full occupancy if all three seats have someone sitting in them.

    Using the boolean array, implement the logic to count the number of full rows on the plane.
    Note: A new row starts at every third element. For example, row one begins with index 0, row two begins with index 3, and so on.

    Examples:
    getNumberOfFullRows([false, false, false, true, true, true]) → 1
    getNumberOfFullRows([true, true, true, true, true, true]) → 2
    getNumberOfFullRows([false, true, true, false, true, true]) → 0
     */

    // loop seatingChart array
    // if index reads true, trueCounter++, else trueCounter = 0
    // if trueCounter equals 3, threeInRow++ && trueCounter = 0
    // return threeInRow

    public int getNumberOfFullRows(boolean[] seatingChart) {
        int fullRows = 0;
        int streak = 0;

        for (int i = 0; i < seatingChart.length; i++) {
            if (i % 3 == 0) { //new row, start over
                streak = 0;
            }

            if (seatingChart[i] == false) { //streak continues
                streak++;
            } else { //streak is over
                streak = 0;
            }

            if (streak == 3) {
                fullRows += 1;
            }
        }

        return fullRows;

    }

}
