package com.techelevator;

public class Book {

    private String title;
    private String author;
    private double price;

    //title get
    public String getTitle(){
        return title;
    }

    //title set
    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    // create book constructor below
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

}
