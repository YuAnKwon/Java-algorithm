import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 숫자의 개수 입력
        int[] numbers = new int[N];
        
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt(); // 숫자 입력
        }
        
        Arrays.sort(numbers); // 오름차순 정렬
        
        for (int num : numbers) {
            System.out.println(num); // 정렬된 숫자 출력
        }
        
        scanner.close();
    }
}