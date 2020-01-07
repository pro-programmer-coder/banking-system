package core;

import java.util.AbstractList;
import java.util.ArrayList;

public class Account {
    private final int id;
    private final String name;
    protected double balance;
    private final AbstractList<Transaction> transactions = new ArrayList<>();

    public Account(int id, String name, double amt) {
        this.id = id;
        this.name = name;
        credit(amt);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void credit(double amt){
        transactions.add(new Transaction(amt));
        balance += amt;
    }

    public void debit(double amt){
        transactions.add(new Transaction(amt * -1));
        balance -= amt;
    }

    public double currentBalance(){
        return transactions.stream().mapToDouble(Transaction::getAmt).sum();
    }

    public double availableBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", transactions=" + transactions +
                '}';
    }
}
