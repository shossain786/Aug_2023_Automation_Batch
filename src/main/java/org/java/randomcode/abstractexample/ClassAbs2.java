package org.java.randomcode.abstractexample;

public class ClassAbs2 {
    private int balance;
    public void transferMoney(int amount) {
        if (amount <= 0) {
            System.out.println("We can not transfer the amount!");
            return;
        }
        setBalanceFromDB();

        if (checkWithDrawCapability(amount)) {
            System.out.println(amount + " is successfully transferred!");
        } else
            System.out.println("The amount can not be transferred as its not maintaining the minimum balance of 1000");

    }
//    min = 1000
    private Boolean checkWithDrawCapability(int amountToWithdraw) {
        if ((balance - amountToWithdraw) > 1000)
            return true;
        else
            return false;
    }
    private void setBalanceFromDB() {
        // code for fetching the balance from DB
        balance = 50000;
    }
}
