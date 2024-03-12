package array;

public class Array1Ref4 {
    public static void main(String[] args) {

        //배열 변수 선언
        int[]students ={90,70,60,50,70}; //벼열 생성
        System.out.println(students.length);



        for (int i = 0; i < students.length; i ++) {
            System.out.println("학생 " + (i+1) +" 점수 "+students[i]);
        }

    }
}
