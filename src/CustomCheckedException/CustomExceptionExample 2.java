package CustomCheckedException;

public class CustomExceptionExample {
    public static void main(String[] args) throws InsufficientBalanceException {
        BankAccount bankAccount = new BankAccount(4000);

        try {
            bankAccount.withdraw(6000);
        } catch (InsufficientBalanceException insufficientBalanceException) {
            System.out.println(insufficientBalanceException.getMessage());
        }
    }
}
