package day11;

public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = {5,2,3,4,5};
        int temp ;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
