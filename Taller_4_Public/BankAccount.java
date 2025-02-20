package Taller_4_Public;

public class BankAccount {
    private int numAccount;
    private double salary;
    public String typeAccount;

    public BankAccount(int numAccount, String typeAccount) {
        this.numAccount = numAccount;
        this.typeAccount = typeAccount;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void showInfo() {
        System.out.println("Account Number: " + numAccount);
        System.out.println("Type of Account: " + typeAccount);
        System.out.println("Salary: $" + salary);
    }
}

class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(12345, "Savings");
        account.setSalary(5000.0);
        account.showInfo();

        System.out.println("No se puede acceder directamente a 'numAccount' porque es privado.");
    }
}

