package day2;

import java.util.Scanner;

public class Test {
    public static boolean manuReset = false ;
    public static boolean off = false ;
    public static int setBT = 1;
    public  void setButton(){
        switch (setBT){
            case 1 :
                manuReset = false;
                off = false;
                break;
            case 2 :
                manuReset = false;
                off = true;
                break;
            case 3:
                manuReset = true;
                off = false;
                break;
            default :
                break;

        }

    }
    public static void main(String[] args) {
        Test test = new Test();
        do{
            System.out.println("####################");
            System.out.println("# 1. 덧셈");
            System.out.println("# 2. 뺄셈");
            System.out.println("# 3. 곱셈");
            System.out.println("# 4. 나눗셈");
            System.out.println("# 5. 종료");
            System.out.println("####################");
            do {
                System.out.print("# 메뉴 번호를 입력해주세요. : ");
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();
                int num = Integer.parseInt(input);
                switch (num) {
                    case 1:
                        System.out.println(" 1 => 덧셈입니다.");
                        setBT = 1;
                        test.setButton();
                        break;
                    case 2:
                        System.out.println(" 2 => 뺄셈입니다.");
                        setBT = 1;
                        test.setButton();
                        break;
                    case 3:
                        System.out.println(" 3 => 곱셈입니다.");
                        setBT = 1;
                        test.setButton();
                        break;
                    case 4:
                        System.out.println(" 4 => 나눗셈입니다.");
                        setBT = 1;
                        test.setButton();
                        break;
                    case 5:
                        System.out.println(" 5 => 종료입니다.");
                        setBT = 1;
                        test.setButton();
                        break;
                    default:
                        System.out.println("# 잘못 입력하셨습니다. ");
                        System.out.print("# 메뉴를 다시 보시겠습니까? : 1. 네    2. 아니오  : ");
                        String yesOrNo = sc.nextLine();
                        int set = Integer.parseInt(yesOrNo);
                        if (set == 1) {
                            setBT = 2;
                            test.setButton();
                        }
                        else {
                            setBT = 3;
                            test.setButton();
                        }
                        break;
                }
            }while (manuReset);
        }while (off);

    }
}
