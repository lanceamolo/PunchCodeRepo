package com.techelevator;

public class FruitTree {

    private String typeOfFruit;
    private int piecesOfFruitLeft;

    public FruitTree(String typeOfFruit, int startingPiecesOfFruit){
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingPiecesOfFruit;
    }

    public String getTypeOfFruit(){
        return typeOfFruit;
    }

    public int getPiecesOfFruitLeft(){
        return piecesOfFruitLeft;
    }

    public boolean pickFruit(int numberOfPiecesToRemove){
        // piecesOfFruitLeft = 3
        // numberOfPiecesToRemove = 2
        // piecesOfFruitLeft = 1

        if(piecesOfFruitLeft - numberOfPiecesToRemove >= 0){
            piecesOfFruitLeft = piecesOfFruitLeft - numberOfPiecesToRemove;
            // same as piecesOfFruitLeft -= numberOfPiecesToRemove;
            return true;
        } else {
            return false;
        }
        return true;
    }

}
