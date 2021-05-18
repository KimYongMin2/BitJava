package day11;

import java.util.ArrayList;
import java.util.Collection;

class MyElement implements Comparable{
    private int i;
    MyElement(int i){
        this.i = i;
    }

    public int getI(){
        return this.i;
    }

    @Override
    public int compareTo(Object obj) {
        MyElement m = (MyElement) obj;
        if(this.i < m.getI()){
            return -1;
        }else if(this.i > m.getI()){
            return 1;
        }else {
            return 0;
        }
    }
}
public class SortTestEx {
    static void BubbleSortArrayList(ArrayList al){
        MyElement temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < al.size() - 1; i++) {
                MyElement m1 = (MyElement) al.get(i);
                MyElement m2 = (MyElement) al.get(i + 1);
                if (m1.compareTo(m2) > 0) {
                    temp = m1;
                    al.set(i, m2);
                    al.set(i + 1, temp);
                    sorted = false;

                }

            }
        }
        for (Object o : al) {
            System.out.println(((MyElement)o).getI());
        }
    }
    public static void main(String[] args) {
/*        MyElement m1 = new MyElement(10);
        MyElement m2 = new MyElement(200);
        System.out.println(m1.compareTo(m2));
        System.out.println(m2.compareTo(m2));
        System.out.println(m2.compareTo(m1));*/
        ArrayList al = new ArrayList();
        al.add(new MyElement(2));
        al.add(new MyElement(1));
        al.add(new MyElement(2));
        al.add(new MyElement(3));
        BubbleSortArrayList(al);


    }
}
