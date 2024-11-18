import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){ //입력이 있을 동안 계속 반복
            int A = sc.nextInt(); // 첫 번째 정수 A
            int B = sc.nextInt(); // 두 번째 정수 B
            
            if (A==0 & B==0){
                break; // 두 정수가 0일 경우 반복종료.
            }
            
            // A+B를 출력.
            System.out.println(A+B);
        }

    }
}
