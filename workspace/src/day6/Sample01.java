package day6;

class MyClass2 {
    MyClass2() {System.out.println("default Constructor"); }
    static { System.out.println("Static Constructor");}
}
public class Sample01 {
    public static void main(String[] args) {
        //MyClass m = new MyClass();
        //MyClass m1 = new MyClass();
        //System.out.println(MyClass.b);
        //System.out.println(MyClass.b);
        MyClass2 m3 = new MyClass2();
        MyClass2 m4 = new MyClass2();

    }
}

class MyClass {
    int a;
    int a1 = 10;
    MyClass(){
        //a1 = 20;
        System.out.println(a1);
    }
    static int b;
    static {
        b = 20;
    }
}