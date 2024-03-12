package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수를 입력하세요:");
        int count =scanner.nextInt();

        int[] nubmers = new int[count];
        int sum =0;
        double avg=0;

        System.out.println(count+"개의 정수를 입력하세요");
        for (int i = 0; i < count; i++) {
            nubmers[i] =scanner.nextInt();
            sum += nubmers[i];
            
        }
        avg = (double) sum /count;
        System.out.println("입력한 정수의 합계: "+sum);
        System.out.println("입력한 정수의 평균: "+avg);
    }
}
