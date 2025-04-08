import java.io.*;
import java.util.*;

public class Solution{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

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

            // 합 배열
            int[] rowSumArr = new int[100];
            int[] colSumArr = new int[100];
            int[] diaSumArr = new int[2];

            // 최댓값 초기화
            int max = 0;

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

                if(rowSum > max) max = rowSum;
                if(colSum > max) max = colSum;

                // 대각선 합 구하기
                diaSumArr[0] += arr[j][j];
                diaSumArr[1] += arr[j][99-j];
            }

            // 최댓값 구하기
            if(diaSumArr[0] > max ) max = diaSumArr[0];
            if(diaSumArr[1] > max ) max = diaSumArr[1];

            bw.write("#" + T + " " + max + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}