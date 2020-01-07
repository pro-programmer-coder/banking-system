package core;

public class CreditAccount extends Account{

    IntrestRate intrestRate;

    public CreditAccount(int id, String name, double amt, IntrestRate intrestRate) {
        super(id, name, amt);
        this.intrestRate = intrestRate;
    }

    @Override
    public void debit(double amt) {
        if(super.availableBalance() - amt < 0){
            amt += (IntrestRate.getIntrestRate(intrestRate)*amt);
        }
        super.debit(amt);
        super.availableBalance();
    }
}
