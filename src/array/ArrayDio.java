package array;

public class ArrayDio {
    public static void main(String[] args) {
        //2  X 3 2차원 배열을 만든다.

        int[][] arr = new int[2][3];


        arr[0][0] =1;
        arr[0][1] =2;
        arr[0][2] =3;
        arr[1][0] =4;
        arr[1][1] =5;
        arr[1][2] =6;

        // 0 row
        System.out.print(arr[0][0]+ " ");
        System.out.print(arr[0][1]+ " ");
        System.out.println(arr[0][2]+ " ");

        // 1 row
        System.out.print(arr[1][0]+ " ");
        System.out.print(arr[1][1]+ " ");
        System.out.println(arr[1][2]+ " ");
    }
}
