package scanner;


import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요:");
        int intVlaue1 = scanner.nextInt();
        System.out.print("두번쨰 숫자를 입력하세요:");
        int intVlaue2 = scanner.nextInt();
        int sum = intVlaue1 + intVlaue2;
        System.out.println("두수의 합은:"+ sum);


    }
}
