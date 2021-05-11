package day6;

class MyClass3 {
    int a;
    MyClass3(){
        a = 10;
        System.out.println(a);
    }
}
class MyClass4 {
    int a;
    static int b;
    static {
        b = 10;
        //System.out.println(b);
        System.out.println("Static Initial");
    }
    MyClass4() {
        System.out.println(b++);
        System.out.println("Default Contructor");
    }
}
public class Sample02 {
    public static void main(String[] args) {
//		MyClass3 m = new MyClass3();
//		MyClass3 m1 = new MyClass3();
        MyClass4 m2 = new MyClass4();
        MyClass4 m3 = new MyClass4();


    }

}