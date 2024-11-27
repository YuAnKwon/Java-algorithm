import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int max = 0;  // 최댓값을 저장할 변수
        int position = 0;  // 최댓값이 몇 번째 수인지 저장할 변수

        // 9개의 자연수 입력
        for (int i = 1; i <= 9; i++) {
            int num = scanner.nextInt();  // 입력받은 자연수

            if (num > max) {  // 현재 입력된 수가 기존 최댓값보다 크면
                max = num;  // 최댓값을 갱신
                position = i;  // 해당 위치를 저장
            }
        }

        // 최댓값과 그 위치 출력
        System.out.println(max);
        System.out.println(position);
        
        scanner.close();  // Scanner 객체 닫기
    }
}
