package tests;


import core.Account;
import core.CreditAccount;
import core.IntrestRate;

import java.time.Instant;

public class MainUnit {
    public static void main(String[] args) {
        Account account = new Account(001, "NoName", 2314.65);

        System.out.println(account.toString());

        account.credit(30);

        System.out.println(account.toString());

        System.out.println("Available Balance: " + account.availableBalance());
        System.out.println("Current Balance: " + account.currentBalance());

        opening_balance_test();
        credit_test();
        debit_test();
    }

        public static void opening_balance_test(){
            //arrange & act
            double openingBalance = 56.78;
            Account acc = new CreditAccount(1, "Selvyn", openingBalance, IntrestRate.BusinessLoan);

            //assert
            if (openingBalance == acc.availableBalance()
                    && openingBalance == acc.currentBalance())
                System.out.println("opening_balance_test: success");
            else
                System.out.println("opening_balance_test: fail");
        }

        public static void credit_test(){
            //arrange
            double openingBalance2 = 56.78;
            double amountToDeposit = 44;
            Account acc2 = new Account(1, "Selvyn", openingBalance2);

            //act
            acc2.credit(amountToDeposit);

            //assert
            if (openingBalance2 + amountToDeposit == acc2.availableBalance()
                    && openingBalance2 + amountToDeposit == acc2.currentBalance())
                System.out.println("credit_test: success");
            else
                System.out.println("credit_test: fail");
        }

        public static void debit_test(){
            //arrange
            double openingBalance3 = 56.78;
            double amountToDebit = 44;
            Account acc3 = new Account(1, "Selvyn", openingBalance3);

            //act
            acc3.debit(amountToDebit);

            //assert
            if (openingBalance3 - amountToDebit == acc3.availableBalance()
                    && openingBalance3 - amountToDebit == acc3.currentBalance())
                System.out.println("debit_test: success");
            else
                System.out.println("debit_test: fail");
        }
    }