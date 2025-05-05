import java.io.*;
import java.util.*;

public class Solution{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스 10번
        for (int i = 1; i <= 10; i++) {
            // 테스트 케이스
            int T = Integer.parseInt(br.readLine());

            int[][] ladder = new int[100][100]; // 100x100

            // 100x100 배열 생성
            for (int j = 0; j < 100; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 0; k < 100; k++) {
                    ladder[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            int startCol = 0;
            int min = Integer.MAX_VALUE; // 거리 최솟값
            int minCol = 0;

            for (int j = 0; j < 100; j++) {
                if(ladder[0][j] == 1){ // 1이면 시작
                    startCol = j; // 출발 x좌표 저장.
                    int distance = down(startCol, ladder);
                    if (distance <= min){
                        min = distance;
                        minCol = startCol;
                    }
                }
            }
            bw.write("#" + i + " " + minCol + "\n");
        }
        bw.flush(); // 굳이 안해도됨
        bw.close();
        br.close();
    }

    private static int down(int startCol, int[][] ladder) {
        int row = 0;
        int col = startCol;
        int distance = 0;

        // 밑으로 쭉 내려가기
        while(row<99){
            // 왼쪽에 1이 있으면
            if(col>0 && ladder[row][col-1] == 1){
                // 계속 왼쪽으로 이동.
                while(col>0 && ladder[row][col-1] == 1){
                    col--;
                    distance++;
                }
            }
            // 오른쪽에 1이 있으면
            else if(col<99 && ladder[row][col+1] == 1){
                while(col<99 && ladder[row][col+1] == 1){
                    col++;
                    distance++;
                }
            }
            row++;
            distance++;
        }


        return distance;
    }
}
