package array;

public class Array1Ref3 {
    public static void main(String[] args) {

        int[] students; //배열 변수 선언
        students = new int[]{90,70,60,50,70}; //벼열 생성

        System.out.println(students.length);



        for (int i = 0; i < students.length; i ++) {
            System.out.println("학생" + (i+1) +"점수"+students[i]);
        }

    }
}
