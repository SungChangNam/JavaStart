package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balace =1000;
        Scanner scanner =new Scanner(System.in);
        System.out.println();

        while (true){
            System.out.println("-------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액확인 | 종료");
            System.out.println("-------------------------------");
            System.out.print("선택 :");

            int choico =scanner.nextInt();
            int amount;

            switch (choico){
                case 1:
                    System.out.print("입금 액을 입력하세요 :");
                    amount = scanner.nextInt();
                    balace= deposit(balace,amount);
                    break;
                case 2:
                    System.out.print("출금 액을 입력하세요:");
                    amount = scanner.nextInt();
                    balace =withdraw(balace,amount);
                    break;
                case 3:
                    System.out.println("현재 잔액: "+balace+ "원");
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다");
                    return;
                default:
                    System.out.println("올바른 선택을 하세요");
            }
        }


    }
    public static int deposit(int balance, int amount ){
        balance +=amount;
        System.out.println(amount +"원 을 입급 했습니다. 현재 잔액 :" +balance +"원");
        return balance;
    }

    public static int withdraw(int balance ,int amount ){
        if (balance >=amount) {
            balance -=amount;
            System.out.println(amount +"원 을 출금 했습니다. 현재 잔액 :" +balance+"원");
        }else {
            System.out.println(amount +"원을 출금하려 했으나 잔액이 부족합니다.");

        }

        return balance;
    }

}
