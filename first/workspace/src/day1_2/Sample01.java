package day1_2;

public class Sample01 {
    public static void main(String[] args) {
        System.out.println("Hello, Java");
        int a = 10;
        int b = 20;
        System.out.printf("%d + %d = %d", a, b, a + b);
        System.out.println();
        System.out.println(a + " + " + b + " = " + (a + b));
        String name = "세종대왕";
        boolean check = true;
        char a1 = '왕';
        float a2 = 10.2f;
        double a3 = 10.30d;
        System.out.printf("%s, %s, %s, %s, %s",
                name, check, a1, a2, a3);
    }
}