package day11;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add(1);
        s.add(2);
        s.add(2);
        s.add(3);
        s.add(2);
        Iterator iter = s.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
