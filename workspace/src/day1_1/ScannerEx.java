package day1_1;

import java.util.*;
public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 하나 입력하시오.:");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        System.out.println("숫자는 : " + num);
        // "7" + 7 => "77"
        System.out.printf("숫자는 : %d",num);
    }

}
