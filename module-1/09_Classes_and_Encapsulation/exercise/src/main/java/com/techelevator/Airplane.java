package com.techelevator;

public class Airplane {

    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;

    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public int getAvailableFirstClassSeats() {
        return totalFirstClassSeats - bookedFirstClassSeats;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    public int getAvailableCoachSeats() {
        return totalCoachSeats - bookedCoachSeats;
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public boolean reserveSeats(boolean firstClass, int totalNumberOfSeats) {
        // condition to see if firstClass is true
        if (firstClass) {
            // return false if totalNumberOfSeats exceeds the amount of available seats in first class(getAvailableFirstClassSeats())
            if (totalNumberOfSeats > getAvailableFirstClassSeats()) {
                return false;
            } else {
                // if it doesn't exceed the seat count, add totalNumberOfSeats to bookedFirstClassSeats
                bookedFirstClassSeats += totalNumberOfSeats;
            }
            // condition if firstClass is false
        } else {
            // same concept as above but for Coach Seats
            if (totalNumberOfSeats > getAvailableCoachSeats()) {
                return false;
            } else {
                bookedCoachSeats += totalNumberOfSeats;
            }
        }
        return true;
    }

}
