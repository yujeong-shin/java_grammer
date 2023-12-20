package C14Interface.BankService;

import java.util.Scanner;

public class BankController {
    public static void main(String[] args) {
        System.out.println("사용자 계좌 번호를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        String accountNum = sc.nextLine();
        BankAccount yujeong = new BankAccount(accountNum);
        while(true){
            System.out.println("입금을 원하시면 1번을, 출금을 원하시면 2번을 입력하세요.");
            int menu = sc.nextInt();
            //입금
            if(menu==1){
                System.out.println("카드로 이용하실 고객은 1번을, 카페이로 이용하실 고객은 2번을 입력하세요.");
                int serviceNum = sc.nextInt();
                //1번 서비스 : Card결제 서비스
                if(serviceNum==1){
                    System.out.println("입금 서비스 - 카드 결제 서비스를 선택하셨습니다.");
                    System.out.println("카드로 입금하실 가격을 입력하세요.");
                    int money = sc.nextInt();
                    BankService cardService = new BankCardService();
                    cardService.deposit(yujeong, money);
                }
                //1번 서비스 : Kapay결제 서비스
                else if(serviceNum==2){
                    System.out.println("입금 서비스 - 카페이 결제 서비스를 선택하셨습니다.");
                    System.out.println("카페이로 입금하실 가격을 입력하세요.");
                    int money = sc.nextInt();
                    BankService cardService = new BankKapayService();
                    cardService.deposit(yujeong, money);
                }else{
                    System.out.println("잘못된 서비스 번호입니다.");
                    break;
                }
            }
            // 출금
            else if(menu==2){
                System.out.println("카드로 이용하실 고객은 1번을, 카페이로 이용하실 고객은 2번을 입력하세요.");
                int serviceNum = sc.nextInt();
                //1번 서비스 : Card결제 서비스
                if(serviceNum==1){
                    System.out.println("출금 서비스 - 카드 결제 서비스를 선택하셨습니다.");
                    System.out.println("카드로 출금하실 가격을 입력하세요.");
                    int money = sc.nextInt();
                    BankService cardService = new BankCardService();
                    cardService.withdraw(yujeong, money);
                }
                //1번 서비스 : Kapay결제 서비스
                else if(serviceNum==2){
                    System.out.println("출금 서비스 - 카페이 결제 서비스를 선택하셨습니다.");
                    System.out.println("카페이로 출금하실 가격을 입력하세요.");
                    int money = sc.nextInt();
                    BankService cardService = new BankKapayService();
                    cardService.withdraw(yujeong, money);
                }else{
                    System.out.println("잘못된 서비스 번호입니다.\n");
                    break;
                }
            }else {
                System.out.println("잘못된 메뉴 번호입니다.\n");
                break;
            }
        }
    }
}
