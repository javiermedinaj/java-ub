public class MainBank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(12345678, 1000, 0.1);
        account.updateBalance();
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("DNI: " + account.getDni());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Interest rate: " + account.getInterestRate());
    }
}