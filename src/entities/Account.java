package entities;

//classe abstrada para uso de herança;
public abstract class Account {
    //atributos da classe Account;
    private Integer number;
    private String holder;
    protected Double balance;

    //contrutor padrão sem argumentos;
    public Account (){
    }

    //construtor padrão com argumentos;
    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    //metodo para sacar, balanço menos a quantia que quer sacar acrescida da taxa de 5;
    public void withdraw(double amount){
        balance -= amount +5;
    }

    //metodo para depositar, o balanço recebe o valor do balanço mais o valor do montante;
    public void deposit (double amount){
        balance += amount;
    }
}
