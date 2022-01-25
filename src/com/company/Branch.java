package com.company;

import java.util.ArrayList;

public class Branch {

    // instantiate with branch name, then be able to add new customer with name & initial transaction
    private String branchName;
    private ArrayList<Customer> branchCustomers;

    public Branch(String name){
        this.branchName = name;
        this.branchCustomers = new ArrayList<Customer>();
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if (findCustomer(customerName) == null){
            this.branchCustomers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction){
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null){
            existingCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer (String customerName){
        for (int i=0; i<this.branchCustomers.size(); i++){
            Customer checkedCustomer = this.branchCustomers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getBranchCustomers() {
        return branchCustomers;
    }
}
