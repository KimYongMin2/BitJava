package day2_test;

import java.util.Scanner;

public class Test_my {
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        return Integer.parseInt(inputString);
    }
    public static void main(String[] args) {
        int ame;
        int ameMon=2000;
        int latte;
        int latteMon = 3000;
        int bread;
        int breadMon = 1500;
        int cream;
        int creamMon = 500;

        showManu();

        System.out.println("===========주문===========");
        System.out.print("= 아메리카노 주문 수량 : ");
        ame = getUserInput();
        int sumAme = ame*ameMon;
        System.out.print("= 카페라떼 주문 수량 : ");
        latte = getUserInput();
        int sumLatte = latte*latteMon;
        System.out.print("= 베이글 주문 수량 : ");
        bread = getUserInput();
        int sumBread = bread*breadMon;
        System.out.print("= 크림치즈 주문 수량 : ");
        cream = getUserInput();
        int sumCream = cream*creamMon;

        showOrder(ame, latte, bread, cream, sumAme, sumLatte, sumBread, sumCream);

        showPricePoint(sumAme, sumLatte, sumBread, sumCream);
    }

    private static void showPricePoint(int sumAme, int sumLatte, int sumBread, int sumCream) {
        int sum;
        int point;
        System.out.println("=========================");
        sum = getSum(sumAme, sumLatte, sumBread, sumCream);
        System.out.println("총 구매 금액 : " + sum + "원");
        point = getPoint(sum);
        System.out.println("포인트 적립 : " + point + "점");
    }

    private static int getSum(int sumAme, int sumLatte, int sumBread, int sumCream) {
        int sum;
        sum = sumAme + sumBread + sumLatte + sumCream;
        return sum;
    }

    private static int getPoint(int sum) {
        int point;
        if (sum >=30000){
            point = sum /50;
        }
        else if (sum >=12000) {
            point = sum / 100;
        }
        else{
            point = 0;
        }
        return point;
    }

    private static void showOrder(int ame, int latte, int bread, int cream, int sumAme, int sumLatte, int sumBread, int sumCream) {
        System.out.println("===========금액===========");
        System.out.printf("= 1. 아메리카노 %d개 %d원\n", ame, sumAme);
        System.out.printf("= 2. 카페라떼 %d개 %d원\n", latte, sumLatte);
        System.out.printf("= 3. 베이글 %d개 %d원\n", bread, sumBread);
        System.out.printf("= 4. 크림치즈 %d개 %d원\n", cream, sumCream);
    }

    private static void showManu() {
        System.out.println("===========메뉴===========");
        System.out.println("= 1. 아메리카노 2000원");
        System.out.println("= 2. 카페라떼 3000원");
        System.out.println("= 3. 베이글 1500원");
        System.out.println("= 4. 크림치즈 500원");
    }
}