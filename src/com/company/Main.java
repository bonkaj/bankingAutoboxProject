package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bank bank = new Bank("US Bank");

        bank.addBranch("Stillwater");

        bank.newCustomer("Stillwater", "Austin", 100.00);

        bank.newCustomer("Stillwater", "Ashley", 200.00);

        bank.newCustomer("Stillwater", "Louie", 1.00);

        bank.addBranch("Minneapolis");

        bank.newCustomer("Minneapolis", "John", 75.00);

        bank.addCustomerTransaction("Stillwater", "Austin", 50.00);
        bank.addCustomerTransaction("Stillwater", "Austin", 25.00);
        bank.addCustomerTransaction("Stillwater", "Ashley", 50.00);

        bank.listCustomers("Stillwater", false);
    }
}
