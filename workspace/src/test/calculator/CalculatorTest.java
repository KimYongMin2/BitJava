package test.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Operations cal = new Operations();
            while (true) {
                showMenu();
                Float menuButton = getMenuButton();
                if (menuButton == null) break;
                float num1 = getNum1();
                float num2 = getNum2();
                calculatorOn(cal, menuButton, num1, num2);
            }
    }

    private static void calculatorOn(Operations cal, Float menuButton, float num1, float num2) {
        float result = 0;
        if (menuButton == 1) {
            result = cal.add(num1, num2);
        } else if (menuButton == 2) {
            result = cal.sub(num1, num2);
        } else if (menuButton == 3) {
            result = cal.mul(num1, num2);
        } else if (menuButton == 4) {
            result = cal.iMul(num1, num2);
        } else {
            System.out.println("# 메뉴를 잘못입력하였습니다.");
        }
        System.out.println("# 결과는 : " + result + "입니다.");
    }

    private static float getNum2() {
        System.out.print("# 두번째 숫자를 입력해주세요 : ");
        return inputFloat();
    }

    private static float getNum1() {
        System.out.print("# 첫번째 숫자를 입력해주세요 : ");
        return inputFloat();
    }

    private static Float getMenuButton() {
        System.out.print("# 메뉴를 선택해주세요 : ");
        float menuButton = inputFloat();
        if(menuButton == 5){
            System.out.println("# 종료되었습니다.");
            return null;
        }
        return menuButton;
    }

    private static void showMenu() {
        System.out.println("#####################");
        System.out.println("# 1. 덧셈");
        System.out.println("# 2. 뺄셈");
        System.out.println("# 3. 곱셈");
        System.out.println("# 4. 나눗셈");
        System.out.println("# 5. 종료");
        System.out.println("#####################");
    }

    public static float inputFloat() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return Float.parseFloat(input);
    }

    public static int inputInt() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return Integer.parseInt(input);
    }
}
