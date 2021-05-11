package day6;

class Animal2 {
    void breathing() { System.out.println("Animal breathing"); }
}
class Dog2 extends Animal2 {
    void barking() { System.out.println("Dog barking"); }
}
class Cat2 extends Animal2  {
    void meowing() { System.out.println("Cat meowing"); }
}
public class Sample06 {
    static void test1(Dog d) {}
    static void test2(Cat c) {}
    static void test3(Animal a) {}
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.breathing();
        dog.barking();
        Animal2 animal = dog; // implicit cast
        animal.breathing();
        Dog2 dog2 = (Dog2)animal; // explicit cast
        dog2.barking();
        dog2.breathing();

        Object obj = dog;
        Dog2 obj2 = (Dog2)obj;
        obj2.barking();
        obj2.breathing();


//		byte a = Byte.MAX_VALUE;
//		int b = Integer.MAX_VALUE;
//		System.out.println(a + ", " + b);
//		int c = a; // byte -> int => implicit cast(암시적인 형변환)
//		byte d = (byte)c; // int -> byte => explicit cat(명시적인 형변환)
        // value type type cast


    }
}