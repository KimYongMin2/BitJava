package test.arrayTest;

public class Test {
    public static void main(String[] args) {
        char [][] studentAnswer = {{'A' ,'B' ,'A' ,'C' ,'C' ,'D' ,'E' ,'F' ,'A' ,'D'}
                ,{'D' ,'B' ,'A' ,'B' ,'C' ,'A' ,'E' ,'F' ,'A' ,'D'}
                ,{'E' ,'D' ,'D' ,'A' ,'C' ,'B' ,'E' ,'E' ,'A' ,'D'}
                ,{'C' ,'B' ,'A' ,'E' ,'D' ,'D' ,'E' ,'F' ,'A' ,'D'}
                ,{'A' ,'B' ,'D' ,'C' ,'C' ,'D' ,'E' ,'E' ,'A' ,'D'} };
        char [] answer = {'D' ,'B' ,'D' ,'C' ,'C' ,'D' ,'A' ,'E' ,'A' ,'D'};
        int score;
        for (int i = 0; i < studentAnswer.length; i++) {
            score = 0;
            for (int j = 0; j < studentAnswer[i].length; j++) {
                if(studentAnswer[i][j]==answer[j]){
                    score++;
                }
            }
            System.out.println("학생 " + (i+1) + "의 점수 : " + score);
        }

    }
}
