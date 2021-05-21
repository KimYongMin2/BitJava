package day13;

public class ArrayDivideTest {
    public static void main(String[] args) {
        // 배열을 선언해준다.
        int[] arrayOne = {10, 20, 13, 25};
        int[] arrayTwo = {2, 5, 0, 3, 1, 7};
        // 더 긴 값을 저장하기 위한 변수를 만들어준다.
        int count = 0;

        // 두개의 배열을 비교해서 길이가 더 긴 값을 count에 저장한다.
        if (arrayOne.length >= arrayTwo.length) {
            count = arrayOne.length;
        } else {
            count = arrayTwo.length;
        }
        // 나눗셈이기에 double 을 사용하여 result를 만들어준다.
        double result = 0;
        // for문을 사용하는데 아까 더 긴값을 저장해 둔 count 값을 기준으로 돌린다.
        for (int i = 0; i < count; i++) {
            // for문안에서 0으로 나누면 생기는 ArithmeticException과 인텍스를 넘어갈 때 생기는 ArrayIndexOutOfBoundsException을
            // catch하여서 비정상적으로 종료되지 않도록한다.
            try {
                result = arrayOne[i] / arrayTwo[i];
                System.out.println(arrayOne[i] + " / " + arrayTwo[i] + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println("나누기 연산 시 에러가 발생하였습니다.");
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("인덱스 범위를 벗어나는 값에 접근하였습니다.");
            }
        }
    }
}
