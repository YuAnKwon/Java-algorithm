import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 첫째 줄 입력
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()); // N장의 카드 중 3개 선택
        int M = Integer.parseInt(st.nextToken()); // 3개의 숫자 합이 M을 넘지않아야함.

        // 둘째 줄 입력
        st = new StringTokenizer(bf.readLine());
        // 카드 수를 배열에 추가.
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
             array[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;

        // 첫번째 숫자
        for (int i = 0; i < N-2; i++) {
            // 두번째 숫자
            for (int j = i+1; j < N-1; j++) {
                // 세번째 숫자
                for (int k = j+1; k < N; k++) {
                    int result = array[i] + array[j] + array[k];
                    if(result <= M && result > max ){
                        max = result;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
