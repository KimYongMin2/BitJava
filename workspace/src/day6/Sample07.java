package day6;
class Animal3 {
    void breathing() { System.out.println("Animal breathing"); }
}
class Dog3 extends Animal3 {
    void barking() { System.out.println("Dog barking"); }
}
class BlackDog3 extends Dog3{
    void running() { System.out.println("BlackDog running"); }
}
class Cat3 extends Animal3  {
    void meowing() { System.out.println("Cat meowing"); }
}
public class Sample07 {
    static Animal3 test(Animal3 a) {
        Animal3 a2 = null;
        String name = a.getClass().getName();
        switch(name){
            case "Dog":
                a2 = new Dog3();
                break;
            case "BlackDog":
                a2 = new BlackDog3();
                break;
        }
        return a2;
    }
    public static void main(String[] args) {
        BlackDog3 bkDog = new BlackDog3();
        Dog3 dog5 = bkDog;
        Animal3 animal3 = dog5;
        BlackDog3 bkDog2 = (BlackDog3)animal3;
        Dog3 dog6 = (Dog3)animal3;
        dog6.barking();
        dog6.breathing();

        BlackDog3 bkDog3 = new BlackDog3();
        Animal3 obj2 = bkDog3;
        Dog3 dog7 = new Dog3();
        Animal3 obj4 = dog7;

        Animal3 obj = new BlackDog3();
        Animal3 obj3 = new Dog3();
        Animal3 obj5 = test(new BlackDog3());
        Animal3 obj6 = test(new Dog3());

//		Dog dog = new Dog();
//		Animal animal = dog;
//		Dog dog2 = (Dog)animal;

//		Dog dog3 = new Dog();
//		Animal animal2 = dog3;
//		Cat cat = (Cat)animal2; // 형제관계(x)

//		Animal animal3 = new Animal();
//		Dog dog4 = (Dog)animal3;
//		객체가 존재하는 않는 경우 하위 (x)
    }
}