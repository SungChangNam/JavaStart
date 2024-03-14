package method;

public class MethodValue3 {
    public static void main(String[] args) {

        int num1 =5;
        System.out.println("1. changeNum 호출 전, num1: "+num1); //5
        num1 = changeNum(num1);
        System.out.println("4. changeNum 호출 후, num1 :"+num1); //5

    }
    public static int changeNum (int num2){
        num2 = num2 * 2;
        return num2;

    }
}
