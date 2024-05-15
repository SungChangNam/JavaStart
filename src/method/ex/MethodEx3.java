package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance =10000;

        //deposit
        int depositAmout =10000;
        balance +=depositAmout;
        System.out.println(depositAmout +"원 을 입급 했습니다. 현재 잔액 :" +balance +"원");


        //withdraw 2000
        int withdrawAmount =2000;

        if (balance >=withdrawAmount) {
            balance -=withdrawAmount;
            System.out.println(withdrawAmount +"원 을 출금 했습니다. 현재 잔액 :" +balance+"원");
        }else {
            System.out.println(withdrawAmount +"원을 출금하려 했으나 잔액이 부족합니다.");
        }
        System.out.println("최종 잔액 :" +balance+ "원" );
    }

}
