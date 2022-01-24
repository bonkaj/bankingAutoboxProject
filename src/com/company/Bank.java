package com.company;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Customer> bankCustomers;

    public Bank (String name, Customer branchCustomer){
        this.bankName = name;
        this.bankCustomers = new ArrayList<Customer>();
    }

}
