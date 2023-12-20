package C14Interface.BankService;

public class BankAccount {
    private String account_number;
    private int balance;
    BankAccount(String accountNumber){
        this.account_number = accountNumber;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }
    public int checkBalance(){
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}
