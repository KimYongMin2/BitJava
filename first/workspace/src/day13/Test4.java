package day13;

public class Test4 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr2 = new int[] {1,2,3,4};
        int[] arr3 = {1,2,3,4,5};
        String[] names = new String[2];
        names[0] = "이순신";
        names[1] = "세종대왕";

        for (int i = 0; i <names.length; i++) {
            System.out.println(names[i]);
        }

        for (int a : arr2){
            System.out.println(a);
        }

        for (int i : arr3) {
            System.out.println(i);
        }

        int[][] arr4 = {{1,2},{3,4}};
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j]);
            }
            System.out.println();
        }


    }
}
