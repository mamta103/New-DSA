package CustomCheckedException;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! Available: " + balance);
        }
        balance = -amount;
        System.out.println("Withdrawal successful! Remaining balance: "+ balance);
    }


}
