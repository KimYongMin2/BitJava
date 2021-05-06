package test.arrayTest;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        char[][] studentAnswer = new char[5][10];
        char [] answer = new char[10];
        int correct;
        getStudentAnswer(studentAnswer);
        getAnswer(answer);
        showStudentAnswer(studentAnswer);
        showAnswer(answer);
        showTotalScore(studentAnswer, answer);

    }

    private static void showTotalScore(char[][] studentAnswer, char[] answer) {
        int correct;
        System.out.println("------------------------------------------------");
        for (int i = 0; i < studentAnswer.length; i++) {
            correct = 0;
            for (int j = 0; j < studentAnswer[i].length; j++) {
                if(studentAnswer[i][j] == answer[j]){
                    correct ++;
                }
            }
            System.out.println("The Student["+ (i+1) +"]'s Score is " + correct);
        }
    }

    private static void showAnswer(char[] answer) {
        System.out.println("------------------------------------------------");
        System.out.print("답안 : ");
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
        System.out.println();
    }

    private static void showStudentAnswer(char[][] studentAnswer) {
        System.out.println("------------------------------------------------");
        for (int i = 0; i < studentAnswer.length; i++) {
            System.out.print("학생 " + (i+1) + "의 답 :");
            for (int j = 0; j < studentAnswer[i].length; j++) {
                System.out.print(studentAnswer[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void getAnswer(char[] answer) {
        System.out.println("정답을 입력하여 주세요");
        for (int i = 0; i < answer.length; i++) {
            System.out.print(i+1 + "번의 답 : ");
            answer[i] = getUserInputChar();
        }
        System.out.println();
    }

    private static void getStudentAnswer(char[][] studentAnswer) {
        for (int i = 0; i < studentAnswer.length; i++) {
            System.out.println("학생 "+ (i+1) +"의 답안지입니다");
            for (int j = 0; j < studentAnswer[i].length; j++) {
                System.out.print(j+1 + "번 정답을 입력해주세요 : ");
                studentAnswer[i][j] = getUserInputChar();
            }
            System.out.println();
        }
    }

    public static char getUserInputChar() {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        return inputString.charAt(0);
    }
}
