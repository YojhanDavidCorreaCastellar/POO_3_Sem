package Taller_1;

public class BankAccount {
    int numAccount;
    float moneyAmount;
    String accountType;

    public BankAccount() {
        this.accountType = "Ahorro";
        this.numAccount = 59528;
        this.moneyAmount = 250000;
    }

    public BankAccount(String accountType, int numAccount){
        this.accountType = accountType;
        this.numAccount = numAccount;
    }

    public BankAccount(String accountType, int numAccount, float moneyAmount){
        this.accountType = accountType;
        this.numAccount = numAccount;
        this.moneyAmount = moneyAmount;
    }
}
