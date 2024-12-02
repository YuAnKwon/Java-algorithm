import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 테스트 시행 횟수 T
        int T = sc.nextInt();

        for(int i=0; i<T; i++){
            int H = sc.nextInt(); // 호텔의 층 수
            int W = sc.nextInt(); // 각 층의 방 수
            int N = sc.nextInt(); // N번째 손님

            int floor = N % H;
            int room = N / H + 1; // 1호부터 시작하므로 +1

            // 나머지가 0일 경우
            if (floor == 0){
                floor = H;
                room = N / H;
            }

            System.out.println(floor * 100 + room);
        }

        sc.close();

    }
}

