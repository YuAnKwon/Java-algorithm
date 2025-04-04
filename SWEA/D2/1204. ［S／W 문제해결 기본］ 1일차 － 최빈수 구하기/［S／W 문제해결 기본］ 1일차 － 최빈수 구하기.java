import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스 수 T
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int testCaseNum = Integer.parseInt(br.readLine());

            // 점수 배열
            int[] score = new int[101];

            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                int num = Integer.parseInt(st.nextToken());
                score[num]++;
            }

            // 배열안의 최댓값 구하고 그 값의 인덱스 값구하기 (중복되면 가장 높은 인덱스)
            int max_num = 0;
            int max_index = 0;
            for (int j = 0; j < score.length; j++) {
                if(score[j]> max_num){
                    max_num = score[j];
                    max_index = j;
                } else if (score[j] == max_num) {
                    max_index = j;
                }
            }
            System.out.printf("#%d %d\n", testCaseNum, max_index);
        }
    }
}