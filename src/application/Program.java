package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        //para uso do ponto ao invés da virgula;
        Locale.setDefault(Locale.US);
        //criação de uma lista do tipo Account;
        List<Account> list = new ArrayList<>();

        //utilização de upcasting dos obj savingAccount e BusinessAccount para a adição na lista do tipo Account
        list.add(new SavingAccount(1001, "alex", 100.00,0.01));
        list.add(new BusinessAccount(1002, "marcos", 5000.00,100.0));
        list.add(new SavingAccount(1003, "sami", 5200.00,0.01));
        list.add(new BusinessAccount(1004, "sam", 5500.00,400.0));

        double sum = 0.0;
        //utilização do for each para pecorrer a lista fazendo a soma dos balanços;
        for (Account acc : list){
            sum += acc.getBalance();
        }

        //saida de dados, mostra na tela o ttotal dos balanços;
        System.out.printf("total balance: %.2f", sum);

        //percorre a lista Account fazendo um deposito de 100;
        for (Account acc: list){
            acc.deposit(100.00);
        }

        //mostra na tela a atualização do balanço junto ao numero da conta
        for (Account acc: list){
            System.out.printf("updated balance for account %d: %.2f", acc.getNumber(),acc.getBalance());
        }
    }
}
