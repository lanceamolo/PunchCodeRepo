package com.techelevator;

public class BankAccount {

    private String accountHolderName;
    private String accountNumber;
    private int balance;

    // constructor for a new account to start at 0 balance
    public BankAccount(String accountHolderName, String accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    // constructor for a new account to start at user's given balance
    public BankAccount(String accountHolderName, String accountNumber, int balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public int getBalance(){
        return balance;
    }

    public int deposit(int amountToDeposit){
        balance += amountToDeposit;
        return balance;
    }

    public int withdraw(int amountToWithdraw){
        balance -= amountToWithdraw;
        return balance;
    }
}
