package day1_2;

public class Sample02 {
    public static void main(String[] args) {
        // value type 값타입
        // JVM stack메모리 공간에 할당되고 초기화됨.
        int a = 1;
        int b = a;
        System.out.println(a);
        System.out.println(b);
        Employee e = new Employee();
        e.name = "이순신";
        e.age = 30;
        System.out.printf("%s %s",
                e.name, e.age);
        Employee e2 = e;
        e2.name = "세종대왕";
        System.out.printf("%s %s",
                e2.name, e2.age);
        // reference type 참조타입
        // JVAM stack메모리 공간에 e변수 할당되고
        // head메모리 공간에 Employee구조 생성되고
        // 내부 변수 name, age가 할당됨.
        // e변수는 heap메모리 공간의 Employee를 참조함.
    }
}
class Employee {
    public String name;
    public int age;
}
