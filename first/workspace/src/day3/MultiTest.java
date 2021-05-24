package day3;

public class MultiTest {
    public static void main(String[] args) {
        for(int i = 0; i<100; i++){
            if (i%2 ==0){
                System.out.println(i);
            }
            if (i == 10){
                break;
            }
        }
    }
}
