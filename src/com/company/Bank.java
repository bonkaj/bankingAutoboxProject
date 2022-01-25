package com.company;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> branch;

    public Bank (String name){
        this.bankName = name;
        this.branch = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if (findBranch(branchName) == null){
            this.branch.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean newCustomer (String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    private Branch findBranch (String branchName){
        for (int i=0; i<this.branch.size(); i++){
            Branch checkedBranch = this.branch.get(i);
            if(checkedBranch.getBranchName().equals(branchName)){
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if (branchName != null){
            System.out.println("Customers for branch " + branch.getBranchName());

            ArrayList<Customer> branchCustomers = branch.getBranchCustomers();
            for (int i = 0; i < branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer " + branchCustomer.getName() + " is in the list at position " + i);
                if (showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++){
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
