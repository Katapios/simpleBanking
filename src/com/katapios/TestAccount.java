package com.katapios;

public class TestAccount {

    public static void main(String[] args) {

        Customer firstCustomer = new Customer("Dennis Ryumin");
        Customer secondCustomer = new Customer("Ivan Petrov");

        SavingsAccount dennisSavings = new SavingsAccount(1000, 5);
        CheckingAccount dennisAccount = new CheckingAccount(5000, 1000);
        CheckingAccount ivanAccount = new CheckingAccount(500, 100);

        firstCustomer.addAccount(dennisSavings);
        firstCustomer.addAccount(dennisAccount);
        secondCustomer.addAccount(ivanAccount);

        Bank.addCustomer(firstCustomer);
        Bank.addCustomer(secondCustomer);

        System.out.println(Bank.getCustomer(0));
        System.out.println(Bank.getCustomer(1));

        Bank.getCustomer(0).getAccount(0).deposit(2000);
        Bank.getCustomer(0).getAccount(1).withdraw(5500);

        ((SavingsAccount)Bank.getCustomer(0).getAccount(0)).addInterestRate();

        System.out.println(Bank.getCustomer(0));
        System.out.println(Bank.getCustomer(1));

    }
}
