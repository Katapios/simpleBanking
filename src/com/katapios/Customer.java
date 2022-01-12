package com.katapios;

public class Customer {
    private Account[] accounts;
    private String fullName;
    private int customerNumber;
    private static int customerNumberBase = 1000;
    private int numOfAccounts;

    public Customer(String fullName) {
        accounts = new Account[10];
        this.fullName = fullName;
        this.customerNumber = customerNumberBase++;
        this.numOfAccounts = 0;
    }

    public Account getAccount(int accNo) {
        if (accNo < accounts.length && numOfAccounts != 0) {
            return accounts[accNo];
        }
        return null;
    }

    public void addAccount(Account acc) {
        accounts[numOfAccounts] = acc;
        numOfAccounts++;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "fullName='" + fullName + '\'' +
                ", customerNumber=" + customerNumber +
                ", numOfAccounts=" + numOfAccounts +
                '}';
    }
}
