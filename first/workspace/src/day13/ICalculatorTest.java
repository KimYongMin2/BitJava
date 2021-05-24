package day13;

interface  ICalculator{
    int add(int x, int y);
}
public class ICalculatorTest {
    public static void main(String[] args) {
        ICalculator calculator = new ICalculator() {
            public int add(int x, int y) {
                return x + y;
            }
        };

        int c = calculator.add(30, 50);
        System.out.println(c);

        ICalculator calculator1 = (x,y) -> {
            return x + y;
        };

        int d = calculator1.add(30,100);
        System.out.println(d);
    }
}
