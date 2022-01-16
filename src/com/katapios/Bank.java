package com.katapios;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers = new ArrayList<>();
    private int numOfClients = 0;
    //Singleton 2 Double Checked Locking & volatile
    private static volatile Bank instance;

    public static Bank getBank() {
        Bank localInstance = instance;
        if (localInstance == null) {
            synchronized (Bank.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Bank();
                }
            }
        }
        return localInstance;
    }

    private Bank() {

    }

    public Customer getCustomer(int custNo) {
        if (custNo < customers.size()) {
            return customers.get(custNo);
        }
        return null;
    }

    public void addCustomer(Customer newCustomer) {
        customers.add(newCustomer);
        numOfClients++;
    }

    public int getNumOfClients() {
        return numOfClients;
    }

}
