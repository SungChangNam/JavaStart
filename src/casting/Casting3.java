package casting;

public class Casting3 {
    public static void main(String[] args) {

        long maxIntValue = 2147483647L;
        long maxIntOver = 2147483649L; //int 최고값 +11(초가)
        int intValue =0;
        
        intValue = (int) maxIntValue;
        System.out.println("maxIntValueintValue casting = " + intValue);


        intValue =(int) maxIntOver;
        System.out.println("maxIntover casting="+ intValue);
        

        
    }
}
