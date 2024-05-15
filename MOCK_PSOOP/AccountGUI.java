public class AccountGUI {
    public static void main(String[] args) throws NegativeAmountException, InsufficientBalanceException {
        Account account = new Account(1122, 2000);

        try{
            account.withdraw(2500);
            account.deposit(3000);
        } catch (NegativeAmountException e) {
            System.out.println("Negative amount exception: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println("Invalid amount exception: " + e.getMessage());
        }


    }
}

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
