package core;

import java.time.Instant;

public class Transation {
    private double amt;
    private Instant date;

    public Transation(double amt, Instant date) {
        this.amt = amt;
        this.date = date;
    }

    public Transation(double amt) {
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