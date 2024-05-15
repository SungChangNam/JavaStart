package method.ex;

public class MethodEx1Ref {
    public static void main(String[] args) {

        System.out.println("avg is :" +avg(1,2,3));

        System.out.println("avg is :" +avg(15,25,30));

    }

    public  static  double avg(int a, int b, int c){
        int sum =a+ b+c;
        return sum /3.0;
    }
}
