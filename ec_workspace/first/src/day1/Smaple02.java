package day1;

class Student{
	public String name;
}

public class Smaple02 {
	public static void main(String[] args) {
		/*
		int a=10;
		int b=20;
		int c=a;
		int d=b;
		System.out.println(d);
		*/
		Student s = new Student();
		s.name = "ȫ�浿";
		Student s2 = s;
		System.out.println(s.name);
		System.out.println(s2.name);
		s2.name = "�̼���";
		System.out.println(s.name);
	}

}
