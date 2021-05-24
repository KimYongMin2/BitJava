package day3;

import java.util.Scanner;

public class Sample09 {
    public static void main(String[] args) {
        System.out.println("#####메뉴#####");
        System.out.println("#1. 메뉴     #");
        System.out.println("#2. 종료     #");
        System.out.println("#############");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int num = Integer.parseInt(input);
        switch (num){
            case 1 :
                System.out.println("메뉴입니다");
                break;
            case 2 :
                System.out.println("종료입니다");
                break;
        }
    }
}
