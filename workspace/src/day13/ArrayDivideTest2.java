package day13;

public class ArrayDivideTest2 {
    public static void main(String[] args) {
        int[] arrayOne = {10, 20, 13, 25};
        int[] arrayTwo = {2, 5, 0, 3, 1, 7};
        double result = 0;
        if (arrayOne.length >= arrayTwo.length) {
            for (int i = 0; i < arrayOne.length; i++) {
                try {
                    result = arrayOne[i] / arrayTwo[i];
                    System.out.println(arrayOne[i] + " / " + arrayTwo[i] + " = " + result);
                } catch (ArithmeticException e) {
                    System.out.println("나누기 연산 시 에러가 발생하였습니다.");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("인덱스 범위를 벗어나는 값에 접근하였습니다.");
                }
            }
        } else {
            for (int i = 0; i < arrayTwo.length; i++) {
                try {
                    result = arrayOne[i] / arrayTwo[i];
                    System.out.println(arrayOne[i] + " / " + arrayTwo[i] + " = " + result);
                } catch (ArithmeticException e) {
                    System.out.println("나누기 연산 시 에러가 발생하였습니다.");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("인덱스 범위를 벗어나는 값에 접근하였습니다.");
                }
            }
        }
    }
}

