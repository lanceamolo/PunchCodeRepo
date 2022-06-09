package com.techelevator;

public class HomeworkAssignment {

    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;

   public HomeworkAssignment(int possibleMarks, String submitterName){
       this.possibleMarks = possibleMarks;

   }

    public int getEarnedMarks(){
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks){
        this.earnedMarks = earnedMarks;
    }

    public int getPossibleMarks(){
        return possibleMarks;
    }

    public String getSubmitterName(){
        return submitterName;
    }

    public String getLetterGrade(){
        // create variable for percentage that takes 2 ints and turns them into a double value
        double percentage = (double) earnedMarks / possibleMarks;

        // if statement that returns letter grades based off of percentage
        if(percentage >= 0.9){
            return "A";
        } else if (percentage >= 0.8){
            return "B";
        } else if (percentage >= 0.7){
            return "C";
        } else if (percentage >= 0.6){
            return "D";
        } else {
            return "F";
        }
    }

}
