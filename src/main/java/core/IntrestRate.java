package core;

public enum IntrestRate {
    HomeLoan(5.67),
    BusinessLoan(2.34);

    private final double rate;

    IntrestRate(double rate)
    {
        this.rate = rate;
    }

//    public double getIntrestRate(IntrestRate rate){
//        switch(rate){
//            case(IntrestRate.BusinessLoan):
//                return 2.34;
//            case(IntrestRate.HomeLoan):
//                return 5.67;
//        }
//    }
}
