package day5;

class Student{
    String name;
    public  Student(String name){
        this.name = name;
    }
    void studying(){
        System.out.println(this.name);
    }
}
public class Object {
    static void test(Student s){
        s.studying();
    }
    public static void main(String[] args){
        Student student = new Student("홍길동");
        student.studying();
        test(student);
        test(new Student("이순신"));

    }
}
