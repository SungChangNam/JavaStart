package loop.Ex;

public class NestedEX1 {
    public static void main(String[] args) {
        for (int i=1; i<=9; i++ ){
            for (int j=i; j<=9; j++){
                System.out.println(i+"*"+j+"="+i*j);
            }

        }
    }
}