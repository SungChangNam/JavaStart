package method.ex;

public class MethodEX2Ref {
    public static void main(String[] args) {

        PrintMessage("Hello wold", 3);
        System.out.println();
        PrintMessage("Jave", 5);
        System.out.println();
        PrintMessage("hi", 7);

    }

    public static void PrintMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }

}
