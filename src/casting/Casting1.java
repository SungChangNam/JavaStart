package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue =10;
        long LongValue ;
        double doubleValue;

        LongValue = intValue; // int -> long
        System.out.println("longVlaue=" + LongValue);
        
        doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue);

        doubleValue =20L; //Long- > double
        System.out.println("doubleValue2 = " + doubleValue);


    }
}
