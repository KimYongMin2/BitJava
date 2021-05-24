package day13;

class A {
    public int a;
    public static int b;
}
public class Test6 {
    public static void main(String[] args) {
        A obj = new A();
        A.b = 10;
        obj.b = 20;
        System.out.println(A.b);

    }

}