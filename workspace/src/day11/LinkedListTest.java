package day11;


import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("이순신");
        linkedList.add(1);
        linkedList.add(100);
        linkedList.add(30.5);
        for (Object o : linkedList) {
            System.out.println(o);
        }
        linkedList.add(0, "세종대왕");
        linkedList.addFirst("을지문덕");
        linkedList.addLast("권율");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
