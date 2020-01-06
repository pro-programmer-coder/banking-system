package core;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Account {
    private final int id;
    private final String name;
    private double balance;
    private final AbstractList<Transation> transactions = new ArrayList<>();

    public Account(int id, String name, double amt) {
        this.id = id;
        this.name = name;
        transactions.add(new Transation(amt));
        this.balance = amt;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void credit(double amt){
        transactions.add(new Transation(amt));
        balance += amt;
    }

    public void debit(double amt){
        transactions.add(new Transation(amt));
        balance -= amt;
    }

    public double currentBalance(){
        return transactions.stream().mapToDouble(Transation::getAmt).sum();
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
