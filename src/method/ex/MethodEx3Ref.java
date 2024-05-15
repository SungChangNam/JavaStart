package method.ex;

public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance =10000;
        //deposit\
         balance=deposit(balance,1000);
         //withdraw 2000
         balance= withdraw(balance,2000);

        System.out.println("최종 잔액 :" +balance+ "원" );
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
