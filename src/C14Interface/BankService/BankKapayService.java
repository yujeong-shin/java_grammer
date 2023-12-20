package C14Interface.BankService;

public class BankKapayService implements BankService{
    @Override
    public void deposit(BankAccount bankAccount, int money) {
        bankAccount.setBalance(bankAccount.getBalance() + money);
        System.out.println(money + "원 입금되었습니다.");
        System.out.println("입금 후 계좌 잔고는 " + bankAccount.getBalance() +"원 입니다.\n");
    }

    @Override
    public void withdraw(BankAccount bankAccount, int money) {
        //현재 잔고가 출금하고 싶은 금액보다 많아야 출금 가능
        if(bankAccount.getBalance() < money) {
            System.out.println("잔액이 부족합니다.");
        }
        else{
            bankAccount.setBalance(bankAccount.getBalance() - money);
            System.out.println(money + "원 출금되었습니다.");
            System.out.println("출금 후 계좌 잔고는 " + bankAccount.getBalance() +"원 입니다.\n");
        }
    }
}
