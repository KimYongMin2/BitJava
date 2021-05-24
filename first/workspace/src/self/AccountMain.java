package self;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        printMenu();
        Account acc = null;
        int menu = 0;
        try {
            while (menu != 9) {
                menu = Integer.parseInt(getUserInput());
                switch (menu) {
                    case 1:
                        System.out.print("계좌번호 : ");
                        String account = getUserInput();
                        System.out.print("예금주 : ");
                        String name = getUserInput();
                        System.out.print("최초 입금 : ");
                        int balance = Integer.parseInt(getUserInput());
                        acc = new Account(account, name, balance);
                        break;
                    case 2:
                        System.out.println(acc);
                        break;
                    case 3:
                        System.out.print("입금할 금액 : ");
                        int upMoney = Integer.parseInt(getUserInput());
                        acc.deposit(upMoney);
                    case 4:
                        System.out.print("출금할 금액 : ");
                        int downMoney = Integer.parseInt(getUserInput());
                        acc.deposit(downMoney);
                        break;
                    case 9:
                        System.out.println("종료합니다");
                        break;
                    default:
                        System.out.println("메뉴를 잘못 입력하셨습니다.");
                }
            }
        }catch ( Exception e){
            System.out.println("");
        }

    }
    private  static void printMenu(){
        System.out.println("====<메뉴>====");
        System.out.println("1. 계좌 생성");
        System.out.println("2. 계좌 정보 출력");
        System.out.println("3. 입금");
        System.out.println("4. 출금");
        System.out.println("9. 종료");
        System.out.println("=============");
        System.out.println(">> 메뉴 : ");
    }
    static String getUserInput(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }
}
