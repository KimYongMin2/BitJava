package day11;

class MyData3<T> {
    private T a;
    MyData3(T a){
        this.a = a;
    }
    public T getA() {
        return this.a;
    }
}
public class GenericsTestEx {
    public static void main(String[] args) {
        MyData3 m = new MyData3(11);
        Object o = m.getA();
        int a = (int)o;
        MyData3 m1 = new MyData3(new String("이순신"));
        Object o1 = m1.getA();
        String s = (String)o1;
        MyData3<Integer> m2 = new MyData3<Integer>(10);
        Integer i = m2.getA();
        MyData3<String> m3 = new MyData3<String>("이순신");
        String s2 = m3.getA();
    }
}

