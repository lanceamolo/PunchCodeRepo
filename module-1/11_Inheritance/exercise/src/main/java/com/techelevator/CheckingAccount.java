package com.techelevator;

public class CheckingAccount extends BankAccount{

    // constructor for a new account to start at 0 balance
    public CheckingAccount(String accountHolderName, String accountNumber){
        super(accountHolderName, accountNumber);
    }

    // constructor for a new account to start at user's given balance
    public CheckingAccount(String accountHolderName, String accountNumber, int balance){
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw){
        // Only allow the withdraw IF the balance isn't going to -$100 or below
        if(getBalance() - amountToWithdraw > -100){
            //subtract amountToWithdraw from balance with super.withdraw()
            super.withdraw(amountToWithdraw);
            // nest if statement to charge $10 if balance is below $0 after the withdraw
            if(getBalance() - amountToWithdraw < 0){
                // subtract $10 from balance for the overdraft fee with super.withdraw()
                super.withdraw(10);
            }
        } else {
            // this code only runs if balance - amountToWithdraw goes below -$100. Withdraw isn't allowed
            super.withdraw(0);
        }

        // return the new balance here after withdraw is done
        return getBalance();
    }

}
