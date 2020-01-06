package core;

public class CreditAccount extends Account{

    IntrestRate intrestRate;

    public CreditAccount(int id, String name, double amt, IntrestRate intrestRate) {
        super(id, name, amt);
        this.intrestRate = intrestRate;
    }
}
