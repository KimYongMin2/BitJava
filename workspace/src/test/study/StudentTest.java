package test.study;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        float computerScore;
        float jaVaScore;
        float mathScore;
        float operaScore;
        float playScore;

        while(true){
            System.out.println("===============================================");
            System.out.print("Computer Science 성적을 입력하세요 : ");
            computerScore = getUserInputFloat();
            System.out.print("JAVA Programming 성적을 입력하세요 : ");
            jaVaScore = getUserInputFloat();
            System.out.print("공학수학 성적을 입력하세요 : ");
            mathScore = getUserInputFloat();
            System.out.print("오페라의 이해 성적을 입력하세요 : ");
            operaScore = getUserInputFloat();
            System.out.print("배드민턴 성적을 입력하세요 : ");
            playScore = getUserInputFloat();
            System.out.println("===============================================");
            System.out.print("다시 입력하시겠습니까? : 1.예    2.아니오    >> ");
            int reset = getUserInputInt();
            if (reset == 2) {
                break;
            }
            else {
                continue;
            }
        }
        
        float sum = computerScore+jaVaScore+mathScore+operaScore+playScore;
        float avg = sum / 5;
        System.out.println("===============================================");
        System.out.println("평점은 : " + avg + "입니다.");

        if (avg>3.7){
            if(jaVaScore>2.5&&mathScore>2.5&&operaScore>2.5&&playScore>2.5&&computerScore>2.5){
                System.out.println("다음 학기 장학금 대상자입니다.");
            }
        }

    }
    public static float getUserInputFloat() {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        return  Float.parseFloat(inputString);
    }

    public static int getUserInputInt() {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        return Integer.parseInt(inputString);
    }
}
