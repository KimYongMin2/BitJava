package day7;
class Myclass{
    int a;
    static int b;
    static {
        b=0;
        System.out.println("생성자");
        System.out.println(b);
    }
}
public class Sample01 {
    public static void main(String[] args) {
        Myclass myclass = new Myclass();
        myclass.a = 1000;
        System.out.println(myclass.a);
        System.out.println(myclass.b);
        myclass.b = 20;
        System.out.println(myclass.b);
        Myclass myclass2 = new Myclass();
        myclass2.a = 100;
        System.out.println(myclass2.a);
        System.out.println(myclass2.b);
        myclass2.b = 25;
        System.out.println(myclass2.b);
    }
}
