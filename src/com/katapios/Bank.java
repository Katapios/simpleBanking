package com.katapios;

public class Bank {
    private Customer[] customers;
    private int numOfClients;


    private Bank() {
        customers = new Customer[1000];
        numOfClients = 0;
    }

    public Customer getCustomer(int custNo) {
        if (custNo < customers.length) {
            return customers[custNo];
        }
        return null;
    }

    public void addCustomer(Customer newCustomer) {
        customers[numOfClients] = newCustomer;
        numOfClients++;
    }

}
