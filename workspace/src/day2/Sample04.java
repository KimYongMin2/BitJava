package day2;

public class Sample04 {
    public static void main(String[] args) {
        // (조건식)? (일치하는경우) : (일치하지 않는경우)
        int a = 10;
        int b = 20;
        int c = (a != b)? 0 : 10;
        System.out.println(c);
        int d = (a > b)? 10 : 20;
        System.out.println(d);
        int e = (a > b)? 10 : (b > 30)? 100: 200;
        System.out.println(e);

        int g = 100;
        g+=3; // g = g + 3
        System.out.println(g);
        g*=3; // g = g * 3
        System.out.println(g);



    }
}
