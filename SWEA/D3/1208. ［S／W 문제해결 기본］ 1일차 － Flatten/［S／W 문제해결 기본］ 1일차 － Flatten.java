import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 10번
        for (int i = 1; i <= 10; i++) {
            // 덤프 횟수
            int dump = Integer.parseInt(br.readLine());

            // 배열 선언
            ArrayList<Integer> arr = new ArrayList<Integer>();
            StringTokenizer st = new StringTokenizer(br.readLine());

            while(st.hasMoreTokens()){
                arr.add(Integer.parseInt(st.nextToken()));
            }

            // 제일 큰거 찾아서 작은거는 +1, -1 한다. dump 횟수 만큼 반복한다. 그리고 맨 마지막에 가장 큰 수와 가장 작은 수 출력
            // 덤프 횟수 만큼 반복
            for (int j = 0; j < dump; j++) {
                Collections.sort(arr); // 정렬
                int min = arr.get(0) + 1; // 작은수는 +1
                int max = arr.get(arr.size() - 1) - 1; // 제일 큰 수는 -1

                arr.set(0, min);
                arr.set(arr.size() - 1, max);
            }
            Collections.sort(arr);
            int result = arr.get(arr.size() -1 ) - arr.get(0);
            System.out.printf("#%d %d\n", i, result);
        }
    }
}