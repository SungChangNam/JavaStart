package method;

import java.util.Scanner;

public class MethodValue1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("숫자 입력 :");
//        int num1 = scanner.nextInt();
        int num1 =5;
        System.out.println("1. changeNum 호출 전 , num1: "+num1);
        changeNum(num1);
        System.out.println("4. changeNum 호출 후, num1 :"+num1);

    }
    public static void changeNum (int num2){
        System.out.println("2. changeNum 변경 전, num2:" +num2);
        num2 = num2 *2;
        System.out.println("3. changeNum 변경 후 ,num2:" +num2);

    }
}
