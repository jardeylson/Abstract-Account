package entities;

//com o uso do extends herdo todos os dados e comportamentos de Account;
public class SavingAccount extends Account{

    private Double interestRate;

    //contrutor padrão sem argumentos com implementação da super classe;
    public SavingAccount(){
        super();
    }

    //implementação da superclasse usando a palavra super.
    public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    //calcula o juros sobre o balanço
    public void updateBalance(){
        balance += balance * interestRate;
    }

    //método sobrescrito
    @Override
    public void withdraw(double amount){
        balance -= amount;
    }
}