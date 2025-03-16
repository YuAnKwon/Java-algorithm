import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄에 수의 개수 N
        int N = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int count = 0; // 소수의 개수.
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(is_Prime(num)){
                count++;
            };
        }
        System.out.println(count);
    }

    public static boolean is_Prime(int num){
        // 1은 소수가 아니다.
        if (num==1){
            return false;
        }

        // num과 나누었을때 나머지가 0이면 아니다.
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }

        // 그 외에는 소수이다.
        return true;
    }
}