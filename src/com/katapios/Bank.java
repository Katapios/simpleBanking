package com.katapios;

public class Bank {
    private static Customer[] customers = new Customer[1000];;
    private static int numOfClients = 0;

    private Bank() {

    }

    public static  Customer getCustomer(int custNo) {
        if (custNo < customers.length) {
            return customers[custNo];
        }
        return null;
    }

    public static void addCustomer(Customer newCustomer) {
        customers[numOfClients] = newCustomer;
        numOfClients++;
    }

    public static int getNumOfClients() {
        return numOfClients;
    }
}
