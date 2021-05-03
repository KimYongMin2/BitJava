package day1_1;

class Student2 {
    public String name;
}
public class Sample02 {
    public static void main(String[] args) {
        // Reference Type
        Student2 s = new Student2();
        s.name = "홍길동";
        Student2 s2 = s;
        System.out.println(s.name);
        System.out.println(s2.name);
        s2.name = "이순신";
        System.out.println(s.name);
		/* Value Type
		int a = 10;
		int b = 20;
		int c = a; // c = 10
		int d = b; // d = 20
		System.out.println(d);
		*/
    }
}