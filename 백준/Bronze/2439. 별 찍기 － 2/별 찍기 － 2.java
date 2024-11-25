import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // N 값을 입력받음
        int N = scanner.nextInt();
        
        // 1부터 N까지 각 줄에 대해 처리
        for (int i = 1; i <= N; i++) {
            // 공백의 개수는 N - i
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            // 별의 개수는 i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // 한 줄이 끝났으므로 줄 바꿈
            System.out.println();
        }
        
        scanner.close();
    }
}
