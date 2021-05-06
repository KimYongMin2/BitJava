package test.study;

import java.util.Scanner;

public class Student {
    public char[] grade = new char[8];
    public String name;
    public String[] subject = new String[8];
    public int[] score = new int[8];
    public int avg = 0;

    public Student(String name){
        this.name = name;
    }

    public void setSubject(){
        for (int i = 0; i < 3; i++) {
            System.out.print("수강하는 과목을 입력해주세요 : ");
            this.subject[i] = getUserInputString();
        }
    }
    public void showInfo(){
        for (int i = 0; i < 3; i++) {
            System.out.println("수강하는 과목은 : " + this.subject[i] + "이고 점수는 : " + this.grade[i] + "입니다.");
            System.out.println(score[i]);
        }
        System.out.println("과목 평균은 :" +  this.avg + "입니다");
    }
    public void setAvg(){
        int sumScore = 0;
        for (int i = 0; i < 3; i++) {
            sumScore =+ this.score[i] ;
        }
        this.avg = sumScore/3;
    }

    public void setScore(){
        for (int i = 0; i < 3; i++) {
            System.out.print(this.subject[i] + "과목의 학점을 입력해주세요 : ");
            this.grade[i] = getUserInputChar();
            setScore(i);
        }
    }

    private void setScore(int i) {
        switch (grade[i]){
            case 'A' :
                this.score[i] = 4;
                break;
            case 'B' :
                this.score[i] = 3;
                break;
            case 'C' :
                this.score[i] = 2;
                break;
            case 'F' :
                this.score[i] = 0;
                break;
            default:
                System.out.println("자기 학점도 모르다니..");
                break;
        }
    }

    public static String getUserInputString() {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        return inputString;
    }

    public static char getUserInputChar() {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        char c = inputString.charAt(0);
        return c;
    }
}
