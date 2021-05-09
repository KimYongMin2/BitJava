package day4;

class Calculator{
    float add(float a, float b){
        float result;
        result = a+b;
        return result;
    }

    float mul(float a, float b){
        float result;
        result = a*b;
        return result;
    }

    float sub(float a, float b){
        float result;
        result = a-b;
        return result;
    }

    float iMul(float a, float b){
        float result;
        result = a/b;
        return result;
    }
}

public class CalculatorTest {
    public static void main(String[] args) {
        float a = 6;
        float b = 3;
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(a,b));
        System.out.println(calculator.sub(a,b));
        System.out.println(calculator.mul(a,b));
        System.out.println(calculator.iMul(a,b));
    }
}
