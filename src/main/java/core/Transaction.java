package core;

import java.time.Instant;

public class Transaction {
    private double amt;
    private Instant date;

    public Transaction(double amt, Instant date) {
        this.amt = amt;
        this.date = date;
    }

    public Transaction(double amt) {
        this.amt = amt;
        this.date = Instant.now();
    }

    public double getAmt() {
        return amt;
    }

    public Instant getWhen() {
        return date;
    }

    @Override
    public String toString() {
        return "Transation{" +
                "amt=" + amt +
                ", date=" + date +
                '}';
    }
}