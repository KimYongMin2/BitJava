package day3;

public class Sample04 {
    public static void main(String[] args) {
        /*
        for (int i = 0; i < 9; i++) {
            System.out.println((i+1) + "단 입니다");
            for (int j = 0; j < 9; j++) {
                System.out.println((i+1) + "*" + (j+1) + "=" + (i+1)*(j+1));
            }
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
         */
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < (4-i); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i*2)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
