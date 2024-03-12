package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        

        for (int i = 0; i < numbers.length; i ++) {
            int number = numbers[i];
            System.out.println(number);
        }
        //향상된 for문 for-each문
        for (int number : numbers) {
            System.out.println(number);
        }

        //향상된 for문을 사용못하는 경우 인덱스 번호를 출력할 경우
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("num" + i+ "번의 결과" + numbers[i]);
            
        }
    }
    
}
