package C12ClassLecture;

public class BankAccountService {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("1234");
        //ba1.setAccount_number("1234");
        ba1.deposit(100000);
        ba1.withdraw(50000);

        BankAccount ba2 = new BankAccount("5678");
        //ba2.setAccount_number("5678");
        ba2.deposit(100000);
        ba2.withdraw(5000000);
    }
}

class BankAccount{
    private String account_number;
    private int balance;
//    별도의 생성자를 만들지 않으면 매개변수 없는 기본 생성자가 숨겨져 있다.
//    생성자란, 클래스가 객체화될 때 자동으로 실행되는 메서드
//    BankAccount(){}
//    생성자의 형태 : 클래스명(){}
    BankAccount(String accountNumber){
        this.account_number = accountNumber;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    //    예금
    public void deposit(int money){
        this.balance += money;
        System.out.println(money + "원 입금되었습니다.");
    }
    //    출금
    public void withdraw(int money){
            if(this.balance < money) {
                System.out.println("잔액이 부족합니다.");
            }
            else {
                this.balance -= money;
                System.out.println(money + "원 출금되었습니다.");
            }
    }

//    checkBalance
    public int checkBalance(){
        return this.balance;
    }
}
