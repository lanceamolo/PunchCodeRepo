package com.techelevator;

public class CreditCardAccount implements Accountable{

    String accountHolder;
    String accountNumber;
    int debt;

    public CreditCardAccount(String accountHolder, String accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.debt = 0;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public int getDebt(){
        return debt;
    }

    public int pay(int amountToPay){
        debt -= amountToPay;
        return debt;
    }

    public int charge(int amountToCharge){
        debt += amountToCharge;
        return debt;
    }

    public int getBalance(){
        return -debt;
    }
}
