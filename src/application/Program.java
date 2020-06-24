package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Account> list = new ArrayList<>();

        list.add(new SavingAccount(1001, "alex", 100.00,0.01));
        list.add(new BusinessAccount(1002, "marcos", 5000.00,100.0));
        list.add(new SavingAccount(1003, "sami", 5200.00,0.01));
        list.add(new BusinessAccount(1004, "sam", 5500.00,400.0));

        double sum = 0.0;
        for (Account acc : list){
            sum += acc.getBalance();
        }

        System.out.printf("total balance: %.2f", sum);

        for (Account acc: list){
            acc.deposit(100.00);
        }

        for (Account acc: list){
            System.out.printf("updated balance for account %d: %.2f", acc.getNumber(),acc.getBalance());
        }
    }
}
