package cond.ex;

public class ScoreEX2 {
    public static void main(String[] args) {
        int distance = 101;

        if (distance <= 1) {
            System.out.println("도보를 이용하세요");
        } else if (distance <= 10) {
            System.out.println("자전거를 이용하세요");
        } else if (distance <= 100) {
            System.out.println("자동차 를 이용하세요");
        } else if (distance >= 100) {
            System.out.println("비행기 를 이용하세요");
        }
    }
}