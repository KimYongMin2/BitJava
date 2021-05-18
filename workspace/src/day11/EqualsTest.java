package day11;

class Person{
    int a;
    Person(int a){
        this.a = a;
    }
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Person) {
            Person p = (Person) obj;
            return this.a == p.a;
        } else {
            return false;
        }
    }
    public String toString(){
        return this.getClass().getName();
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        Person p1 = new Person(10);
        Person p2 = new Person(10);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1);
        System.out.println(p2);
    }
}
