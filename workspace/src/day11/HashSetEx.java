package day11;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person2 ("David", 10));
        set.add(new Person2 ("David", 10));

        System.out.println(set);
    }
}

class Person2{
    String name;
    int age;
    Person2(String name, int age){
        this.name = name;
        this.age = age;
    }

    public  String toString(){
        return name + ":" + age;
    }
}
