package com.techelevator;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(String accountHolderName, String accountNumber){
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance){
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw){
        // only perform transaction of positive $ and room for fee
        if (getBalance() - amountToWithdraw >= 2) {
            super.withdraw(amountToWithdraw);
            //  Charge $2 fee if it goes below $150
            if (getBalance() < 150) {
                super.withdraw(2);
            }
        }


        return getBalance();
    }
}


