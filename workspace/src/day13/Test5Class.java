package day13;

class Employee {
    protected String name;
    protected int age;
    public Employee() {}
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public void working() {
        System.out.println("일한다.");
    }
    public void working(String location) {
        System.out.println(this.name + "가 "
                + location + "에서 일한다.");
    }
    static int salary;
    static {
        salary = 3000;
    }
    static void displaySalary() {
        System.out.println(salary);
    }
}
class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, int age) {
        super(name, age);
    }
    public void eating() {
        System.out.println(this.name + "은 밥을 먹다.");
    }
    public void working() {
        System.out.println("working overriding");
    }
}
public class Test5Class {
    public static void main(String[] args) {
        PartTimeEmployee pemp =
                new PartTimeEmployee("홍길동", 40);
        PartTimeEmployee.salary = 300;
        System.out.println(pemp.salary);
        pemp.displaySalary();
        pemp.eating();
        Employee emp2 = new PartTimeEmployee("세종대왕", 50);
        emp2.working();
        Employee emp3 = new Employee("강감찬", 60);
//		Employee emp = new Employee();
//		Employee emp2 = new Employee("이순신", 20);
//		emp2.working();
//		emp2.working("서울");
//		Employee.displaySalary();

    }
}