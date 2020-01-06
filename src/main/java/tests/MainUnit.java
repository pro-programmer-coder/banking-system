package tests;


import core.Account;
import core.Transation;

import java.util.ArrayList;

public class MainUnit {
    public static void main(String[] args){
        Account account = new Account(001, "NoName", 2314.65);

        System.out.println(account.toString());

        account.credit(29);

        System.out.println(account.toString());

        System.out.println("Available Balance: " + account.availableBalance());
        System.out.println("Current Balance: " + account.currentBalance());

        //arrange & act
        double openingBalance = 56.78;
        Account acc = new Account(1, "Selvyn", openingBalance);

        //assert
        if(openingBalance == acc.availableBalance()
            && openingBalance == acc.currentBalance())
                System.out.println("All good");
        else
            System.out.println("Opps");

        //arrange
        double openingBalance2 = 56.78;
        double amountToDeposit = 44;
        Account acc2 = new Account(1, "Selvyn", openingBalance2);

        //act
        acc2.credit(amountToDeposit);

        //assert
        if(openingBalance2 + amountToDeposit == acc2.availableBalance()
                && openingBalance2 + amountToDeposit == acc2.currentBalance())
            System.out.println("All good");
        else
            System.out.println("Opps");
    }
}