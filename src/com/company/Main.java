package com.company;


public class Main {
    public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount();
    bankAccount.deposit(20000);

        while (true) {
            System.out.println("Your balance: " + bankAccount.getAmount());



            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage() + "balance: " + e.getRemainingAmount());
                try {
                bankAccount.withDraw((int) e.getRemainingAmount());
                System.out.println("balance: " + bankAccount.getAmount());
                 break;


              } catch (LimitException ex) {
                    ex.printStackTrace();
        }
            }
        }
    }
}

