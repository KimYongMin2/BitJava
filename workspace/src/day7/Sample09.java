package day7;

abstract class Student3{
    void studying(){
        System.out.println("Student studying");
    }
    abstract void eating();
}
public class Sample09 {
    public static void main(String[] args) {
        Student3 student3 = new Student3() {
            @Override
            void eating() {
                System.out.println("student eating");
            }
        };
    }
}
