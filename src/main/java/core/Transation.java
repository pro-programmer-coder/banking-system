package core;

import java.time.LocalDateTime;
import java.util.Date;

public class Transation {
    private double amt;
    private LocalDateTime date;

    public Transation(double amt, LocalDateTime date) {
        this.amt = amt;
        this.date = date;
    }

    public double getAmt() {
        return amt;
    }

    public LocalDateTime getWhen() {
        return date;
    }
}
