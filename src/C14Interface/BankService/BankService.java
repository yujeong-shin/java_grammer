package C14Interface.BankService;

public interface BankService {
    public void deposit(BankAccount bankAccount, int money);
    public void withdraw(BankAccount bankAccount, int money);
}
