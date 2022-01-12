package com.katapios;

/**
 * Bank Account class
 * @author denisrumin
 */
public class Account {

    protected double balance;

    /**
     * Constructor that provides initial balance
     *
     * @param balance must be positive
     */
    protected Account(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    /**
     * Default Constructor
     *
     */
    public Account() {
        this.balance = 0;
    }

    /**
     * Method to check balance
     *
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Method to add money to account
     *
     * @param amt amount of money must be positive
     */
    public boolean deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            return true;
        }
        return false;
    }

    /**
     * Method to withdraw money to account
     *
     * @param amt amount of money must not be grater then ballance
     */
    public boolean withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            return true;
        }
        return false;
    }
}
