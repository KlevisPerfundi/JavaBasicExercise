package org.example.Exercise11;

public class AccountApplicayion {
    public static void main(String[] args) {
        int depValue=400;
        int withValue=100;
        Account account = new Account();


        System.out.print("Balance:"+account.getBalance()+" | ");
        System.out.print("Deposit:"+depValue+" | ");
        account.deposit(depValue);
        System.out.println("After operation:"+account.getBalance()+" | ");

        System.out.print("Balance:"+account.getBalance()+" | ");
        System.out.print("Withdrawal:"+withValue+" | ");
        account.withdraw(withValue);
        System.out.print("After operation:"+account.getBalance()+" | ");


        System.out.println("You are debit in bank:"+account.isDebit());



    }
}
