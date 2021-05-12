package popQuiz;

// scanner를 사용하기위해 inport를 시켜줍니다
import java.util.Scanner;

class Operation{
    // 밑의 항목은 클래스 안에 함수로 +,-,*,/ 를 만들어 주었습니다
    int add (int a, int b){
        return a+b;
    }

    int sub (int a, int b){
        return a-b;
    }

    int mul (int a, int b){
        return a*b;
    }

    int iMul (int a, int b){
        return a/b;
    }
    // 밑의 항목은 메뉴를 보이게 호출하는 함수입니다
    void showMenu(){
        System.out.println("##### 메뉴 #####");
        System.out.println("# 1. 사칙연산   #");
        System.out.println("# 2. 종료      #");
        System.out.println("###############");
    }

}

public class Calculator {
    public static void main(String[] args) {
        // class를 사용하여 객체를 만들어줍니다
        Operation operation = new Operation();
        // 결과값을 저장할 변수를 만들어 줍니다
        int result=0;
        // 무한루프를 돌리기위해 while(true)를 이용합니다
        while (true) {
            // 메뉴를 불러주어 화면에 출력합니다
            operation.showMenu();
            // button이라는 변수를 만들어 연산을 할건지 종료를 할건지 정하는 함수를 저장을합니다
            System.out.print("# 항목을 선택해주세요. : ");
            int button = inputInt();
            // 만약 button이 2면 종료가 될수있게 break를 써줍니다
            if (button == 2) {
                System.out.println("# 종료되었습니다.");
                break;
            }
            // 연산자는 ==을 쓰기위해 char형식으로 option이라는 변수를 만들고 받습니다.
            System.out.print("연산자를 선택하시오(+, -, *, /) : ");
            char option = getUserInputChar();
            // 두개의 숫자를 입력받기위해 num1과 num2를 만들어주고 입력받습니다
            System.out.print("첫 번째 숫자를 입력해주세요. : ");
            int num1 = inputInt();
            System.out.print("두 번째 숫자를 입력해주세요. : ");
            int num2 = inputInt();
            /*
            // 아까 저장한 연산자 option을 비교하여 break가 없는 if문으로 비교합니다.
            if (option == '+'){
                result = operation.add(num1, num2);
            }else if (option == '-'){
                result = operation.sub(num1, num2);
            }else if (option == '*'){
                result = operation.mul(num1, num2);
            }else if (option == '/'){
                result = operation.iMul(num1, num2);
            }else{
                System.out.println("연산자를 잘못입력하였습니다.");
            }
             */
            switch (option){
                case '+' :
                    result = operation.add(num1, num2);
                    break;
                case '-' :
                    result = operation.sub(num1, num2);
                    break;
                case '*' :
                    result = operation.mul(num1, num2);
                    break;
                case '/' :
                    result = operation.iMul(num1, num2);
                    break;
                default:
                    System.out.println("연산자를 잘못입력하였습니다.");
            }
            // 결과값을 도출합니다.
            System.out.println("결과는 : " + num1 + " " + option + " " + num2 + " = " + result);
            System.out.println();
        }
    }

    // 스캔을 보다 쉽게 사용하기위해 함수로 사용합니다

    public static int inputInt() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return Integer.parseInt(input);
    }

    public static char getUserInputChar() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return  s.charAt(0);
    }
}