package core;

public enum IntrestRate {
    HomeLoan(0.1),
    BusinessLoan(0.2);

    private final double rate;

    IntrestRate(double rate)
    {
        this.rate = rate;
    }

    public static double getIntrestRate(IntrestRate rate){
        switch(rate){
            case BusinessLoan:
                return BusinessLoan.rate;
            case HomeLoan:
                return HomeLoan.rate;
        }
        return 0;
    }
}
