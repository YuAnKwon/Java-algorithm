import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체를 이용해 입력을 받음.
        Scanner sc = new Scanner(System.in);

        // while 반복으로 각 테스트 케이스를 처리
        while(sc.hasNext()){
            // 각 테스트 케이스에서 A와 B를 입력받음.
            int A = sc.nextInt();
            int B = sc.nextInt();
            // A+B를 출력.
            System.out.println(A+B);
        }

    }
}