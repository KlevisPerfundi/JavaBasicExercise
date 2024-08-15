package org.example.Exercise11;

public class Account {
    private String name;
    private int balance = 0;

    private boolean debit = false;

    public Account() {

    }


    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public boolean isDebit() {
        return debit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else
            System.out.println("The deposit/withdrawal amount must be positive!");
    }

    public void withdraw(int amount) {
        if (amount > 0) {
            balance -= amount;
            if (balance < 0) {
                debit = true;
            }
        }else
            System.out.println("The deposit/withdrawal amount must be positive!");
    }

}





