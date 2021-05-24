package day11;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("이순신");
        arrayList.add(12.3);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).getClass().getName());
        }

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
