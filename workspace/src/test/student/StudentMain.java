package test.student;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {
        String studentName;
        System.out.println("이름을 입력하여주세요");
        studentName = getUserInputString();
        Student student = new Student(studentName);
        student.setSubject();
        student.setScore();
        student.setAvg();
        student.showInfo();

    }

    public static String getUserInputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
