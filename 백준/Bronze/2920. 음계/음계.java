import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 8개의 숫자를 배열로 입력받음
        int[] notes = new int[8];
        for (int i = 0; i < 8; i++) {
            notes[i] = scanner.nextInt();
        }
        
        // ascending인지 확인
        boolean ascending = true;
        boolean descending = true;
        
        for (int i = 0; i < 7; i++) {
            if (notes[i] != notes[i + 1] - 1) {
                ascending = false;
            }
            if (notes[i] != notes[i + 1] + 1) {
                descending = false;
            }
        }
        
        // 결과 출력
        if (ascending) {
            System.out.println("ascending");
        } else if (descending) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
        
        scanner.close();
    }
}
