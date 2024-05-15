class Account {
    private int id;
    private double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Amount cannot be negative.");
        }

        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Transaction completed successfully.");
    }

    public void withdraw(double amount) throws NegativeAmountException, InsufficientBalanceException {
        if (amount < 0) {
            throw new NegativeAmountException("Amount cannot be negative.");
        }

        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient balance.");
        }

        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Transaction completed successfully.");
    }

}