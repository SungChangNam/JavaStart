package array;

public class Array1Ref2 {
    public static void main(String[] args) {

        int[] students; //배열 변수 선언
        students = new int[5]; //벼열 생성


        System.out.println(students.length);





        //변수 값 대입


        students[0] = 90;
        students[1] = 80;
        students[2] = 50;
        students[3] = 70;
        students[4] = 100;

        for (int i = 0; i < students.length; i ++) {
            System.out.println("학생" + (i+1) +"점수"+students[i]);
        }

    }
}
