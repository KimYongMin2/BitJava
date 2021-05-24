package day13;

public class Test3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        for (int i = 0; i <100; i++) {
            if (i == 55){
                break;
            }
            System.out.println(i);
        }

        for (int i = 0; i <100; i++) {
            if (i == 55){
                continue;
            }
            System.out.println(i);
        }


    }
}
