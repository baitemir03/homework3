package com.company;

public class BankAccount {
    private double amount;

    public void deposit(double sum){
        amount += sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (amount< sum){
            throw new LimitException("Your amount is less than balance", getAmount());
        }
        amount -= sum;

    }

    public double getAmount() {
        return amount;
    }
}
