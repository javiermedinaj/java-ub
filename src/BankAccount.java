public class BankAccount {
    private static long lastAccount = 100001;
    private long accountNumber;
    private long dni;
    private double balance;
    private double interestRate;

    public BankAccount(long dni, double balance, double interestRate){
        this.accountNumber = lastAccount++;
        this.dni = dni;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public long getDni(){
        return dni;
    }

    public double getBalance(){
        return balance;
    }

    public double getInterestRate(){
        return interestRate;
    }

    //setters
    public void setDni(long dni){
        this.dni = dni;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }
    //actualizar saldo aplicando interes diario
    public void updateBalance(){
        double interest = balance * interestRate / 365;
        balance += balance * interestRate / 365;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposito exitoso");
        } else {
            System.out.println("Cantidad no válida");
        }

    }


    //retirar
    public void withdraw (double amount){
        if (amount > 0){
            if (balance >= amount){
                balance -= amount;
                System.out.println("Retiro exitoso");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Cantidad no válida");
        }
    }

}
