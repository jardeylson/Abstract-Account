package entities;

//com o uso do extends herdo todos os dados e comportamentos de Account;
public class BusinessAccount extends Account  {

    private Double loanLimit;

    //contrutor padrão sem argumentos com implementação da super classe;
    public BusinessAccount(){
        super();
    }

    //implementação da superclasse usando a palavra super.
    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    //confere se o montante é igual ou menor ao limite de emprestimo ante da efetuação;
    public void loan(double amount){
        if (amount <= loanLimit){
            balance += amount -10.0;
        }
    }
    //método sobrescrito
    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2;
    }
}
