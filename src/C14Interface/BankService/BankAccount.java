package C14Interface.BankService;

public class BankAccount {
    private String account_number;
    private int balance;
    BankAccount(String accountNumber){
        this.account_number = accountNumber;
        this.balance = 0;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}
