package day1;
import java.util.*;
public class ScannerEx {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");
        String input = sc.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("�Է³��� :" + input);
        System.out.printf("num=%d",num);
    }

}
