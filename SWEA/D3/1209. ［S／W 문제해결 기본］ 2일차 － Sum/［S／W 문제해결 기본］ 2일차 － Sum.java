import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // #1(br.readLine) 100개(br.readLine) 100개 100개 ~~~ 이렇게 되는거.
        // 테스트 케이스 10번
        for (int i = 1; i <= 10; i++) {
            int T = Integer.parseInt(br.readLine()); // 테스트 케이스

            // 2차원 배열 생성.
            int[][] arr = new int[100][100];
            for (int j = 0; j < 100; j++) { // 1테스트에 100줄.
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 0; k < 100; k++) { // 한줄에 100개
                    arr[j][k] = Integer.parseInt(st.nextToken()); // j번째 k것.
                }
            }

            // 다 만들엇으면 각 행과 열 대각선의 값들 중 최댓값 구하기. 각 값들을 넣는 배열도 하나 만들기
            int[] rowSumArr = new int[100];
            int[] colSumArr = new int[100];
            int[] diaSumArr = new int[2];

            // 각 행,열,대각선 합 구해서 배열에 넣기
            for (int j = 0; j < 100; j++) {
                int rowSum = 0;
                int colSum = 0;
                for (int k = 0; k < 100; k++) {
                    // 첫번째 행 합 구하기
                    rowSum += arr[j][k];
                    // 첫번째 열 합 구하기
                    colSum += arr[k][j];
                }
                rowSumArr[j] = rowSum;
                colSumArr[j] = colSum;

                // 대각선 합 구하기
                diaSumArr[0] += arr[j][j];
                diaSumArr[1] += arr[j][99-j];
            }

            // 최댓값 구하기
            int rowMax = Arrays.stream(rowSumArr).max().getAsInt();
            int colMax = Arrays.stream(colSumArr).max().getAsInt();
            int diaMax = Arrays.stream(diaSumArr).max().getAsInt();

            int max = Math.max(diaMax, Math.max(rowMax, colMax));
            System.out.printf("#%d %d\n", i, max);
        }
    }
}