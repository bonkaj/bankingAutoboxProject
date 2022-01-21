package com.company;

import java.util.ArrayList;

public class Branch {

    // instantiate with branch name, then be able to add new customer with name & initial transaction
    private String branchName;
    private ArrayList<Customer> branchCustomers;

    public Branch (String name, Customer branchCustomer){
        this.branchName = name;
        this.branchCustomers = new ArrayList<Customer>();
    }



}
