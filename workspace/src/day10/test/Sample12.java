package day10.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Sample12 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        LinkedList ll = new LinkedList();
        ll.add(300);
        ll.add(400);
        ll.add(500);

        Iterator iterator2 = arrayList.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}
