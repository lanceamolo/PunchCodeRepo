package com.techelevator;

import java.util.ArrayList;

public class BankCustomer implements Accountable{

    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<Accountable>();
}
