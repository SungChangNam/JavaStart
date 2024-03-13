package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수를 입력하세요:");
        int n =scanner.nextInt();

        int[] nubmers = new int[n];
        int min,max;

        System.out.println(n + " 개의 정수를 입력하세요");
        for (int i = 0; i < n; i++) {
            nubmers[i] = scanner.nextInt();
            
        }
        min = nubmers[0];
        max = nubmers[0];

        for (int i = 1; i < n; i++) {
            if (nubmers[i] < min){
                min = nubmers[i];
            }
            if (nubmers[i] > max) {
                max = nubmers[i];
            }
        }
        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);

    }
}
