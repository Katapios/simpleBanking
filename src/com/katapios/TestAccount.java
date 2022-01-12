package com.katapios;

public class TestAccount {

    public static void main(String[] args) {
        Bank myBank = new Bank();
        Customer firstCustomer = new Customer("Dennis Ryumin");
        Customer secondCustomer = new Customer("Ivan Petrov");

        SavingsAccount dennisSavings = new SavingsAccount(1000, 5);
        CheckingAccount dennisAccount = new CheckingAccount(5000, 1000);
        CheckingAccount ivanAccount = new CheckingAccount(500, 100);

        firstCustomer.addAccount(dennisSavings);
        firstCustomer.addAccount(dennisAccount);
        secondCustomer.addAccount(ivanAccount);

        myBank.addCustomer(firstCustomer);
        myBank.addCustomer(secondCustomer);

        System.out.println(myBank.getCustomer(0));

        myBank.getCustomer(0).getAccount(0).deposit(2000);
        myBank.getCustomer(0).getAccount(1).withdraw(5500);

        ((SavingsAccount)myBank.getCustomer(0).getAccount(0)).addInterestRate();

        System.out.println(myBank.getCustomer(0).getAccount(0).getBalance());
        System.out.println(myBank.getCustomer(0).getAccount(1).getBalance());

        System.out.println(myBank.getCustomer(1));

    }
}
