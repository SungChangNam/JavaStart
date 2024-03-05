package cond;

public class If6 {
    public static void main(String[] args) {
        int price =1000;
        int age =12;
        int dis=0;

        if (price >=10000){
            dis = dis +1000;
            System.out.println("10000원 이상 구매, 1000월 할인");
        } else if (age <=10){
            dis = dis +1000;
            System.out.println("어린이 1000원 할인");
        }else {
            System.out.println("no dis");
        }
        System.out.println("총 할인 금액 "+ dis +" 원");

        if(true)
            System.out.println("if 문에서 실행");

    }
}
