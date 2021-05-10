package test.student;

import java.util.Scanner;

public class Student {
    public char[] grade = new char[8];
    public String name;
    public String[] subject = new String[8];
    public int[] score = new int[8];
    public int[] orderScore = new int[8];
    public int avg = 0;
    public int orderSum = 0;


    public Student(String name){
        this.name = name;
    }

    public void setSubject(){
        for (int i = 0; i < 3; i++) {
            System.out.print("수강하는 과목을 입력해주세요 : ");
            subject[i] = getUserInputString();
            System.out.print(subject[i] + "의 수강학점을 입력해주세요 : ");
            orderScore[i] = getUserInputInt();
            orderSum = orderSum + orderScore[i];
            System.out.println("수강학점은 : " + orderSum + "입니다.");

        }
    }
    public void showInfo(){
        for (int i = 0; i < 3; i++) {
            System.out.print("수강하는 과목은 : " + subject[i] + "이고 등급은 : " + grade[i] + "입니다.");
            System.out.println(" 점수는 : " +score[i] + "입니다.");
        }
        System.out.println("과목 평균은 :" +  avg + "입니다");
    }
    public void setAvg(){
        int sumScore = 0;
        for (int i = 0; i < 3; i++) {
            sumScore = sumScore + (score[i]*orderScore[i]) ;
        }
        avg = sumScore/orderSum;
    }

    public void setScore(){
        for (int i = 0; i < 3; i++) {
            System.out.print(subject[i] + "과목의 학점을 입력해주세요 : ");
            this.grade[i] = getUserInputChar();
            setScore(i);
        }
    }

    private void setScore(int i) {
        switch (grade[i]){
            case 'A' :
                score[i] = 4;
                break;
            case 'B' :
                score[i] = 3;
                break;
            case 'C' :
                score[i] = 2;
                break;
            case 'F' :
                score[i] = 0;
                break;
            default:
                System.out.println("자기 학점도 모르다니..");
                break;
        }
    }

    public static String getUserInputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static char getUserInputChar() {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        return inputString.charAt(0);
    }

    public static int getUserInputInt() {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        return Integer.parseInt(inputString);
    }
}

