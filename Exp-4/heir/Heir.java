class BankAccount {
    double balance = 5000.0;

    void checkBalance() {
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    void addInterest() {
        balance += (balance * 0.05);
        System.out.println("Interest added.");
        checkBalance();
    }
}

class CheckingAccount extends BankAccount {
    void deductFee() {
        balance -= 2.50;
        System.out.println("Fee deducted.");
        checkBalance();
    }
}

public class Heir {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.checkBalance();
        s.addInterest();
        CheckingAccount c = new CheckingAccount();
        c.checkBalance();
        c.deductFee();
    }
}
