package cond;

public class If3 {
    public static void main(String[] args) {
        int age = 13;

        if (age <= 7) {
            System.out.println("미취학");
        }
        if (8 <= age && age <=13){
            System.out.println("초등학생");
        }
        if (age >= 14 && age <= 16){
            System.out.println("중학생");
        }

    }

    }