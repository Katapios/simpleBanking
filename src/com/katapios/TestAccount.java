package com.katapios;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestAccount {

    public static void main(String[] args) {

        Bank bank = Bank.getBank();

        Customer firstCustomer = new Customer("Dennis Ryumin");
        Customer secondCustomer = new Customer("Ivan Petrov");

        SavingsAccount dennisSavings = new SavingsAccount(1000, 5);
        CheckingAccount dennisAccount = new CheckingAccount(5000, 1000);
        CheckingAccount ivanAccount = new CheckingAccount(500, 100);

        firstCustomer.addAccount(dennisSavings);
        firstCustomer.addAccount(dennisAccount);
        secondCustomer.addAccount(ivanAccount);

        bank.addCustomer(firstCustomer);
        bank.addCustomer(secondCustomer);

        System.out.println(bank.getCustomer(0));
        System.out.println(bank.getCustomer(1));

        bank.getCustomer(0).getAccount(0).deposit(2000);
        try {
            bank.getCustomer(0).getAccount(1).withdraw(7500);
        } //This is our new Exception
        catch (OverdraftException ex) {
            System.out.println(ex.getMessage() + " $" + ex.getDeficit());
        } catch (Exception ex) {
            System.out.println("Something went wrong " + ex.getMessage());
        }

        ((SavingsAccount)bank.getCustomer(0).getAccount(0)).addInterestRate();

        System.out.println(bank.getCustomer(0));
        System.out.println(bank.getCustomer(1));

    }
}
