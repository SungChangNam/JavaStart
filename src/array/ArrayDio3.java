package array;

public class ArrayDio3 {
    public static void main(String[] args) {
        //2  X 3 2차원 배열을 만든다.
        int[][] arr = new int[][]{
            {1,2,3},
            {4,5,6},
        };//row2 column2


        for (int row =0; row< arr.length; row++  ){
            for (int column= 0; column <arr[row].length; column++){
                System.out.print(arr[row][column]+ " ");
            }
            System.out.println();
        }

    }
}
