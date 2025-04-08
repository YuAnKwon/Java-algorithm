import java.io.*;
import java.util.*;

public class Solution{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스 10번
        for (int i = 1; i <= 10; i++) {
            // 테스트 케이스 T
            int T = Integer.parseInt(br.readLine());

            int[][] arr = new int[100][100];

            // 100x100 배열 생성
            for (int j = 0; j < 100; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine()); // 그 다음줄 읽기
                for (int k = 0; k < 100; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            int startCol = 0;
            for (int j = 0; j < 100; j++) {
                if(arr[0][j] == 1){ // 1이면 시작
                    startCol = j; // 출발 x좌표 저장.
                    int result = down(startCol, arr);
                    if(result == 2){
                        bw.write("#"+ i + " " + startCol + "\n");
                        break;
                    }
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static int down(int startCol, int[][] arr) {
        int row = 0;
        int col = startCol;

        // 밑으로 쭉 내려가기
        while(row<99){
            // 왼쪽에 1이 있으면
            if(col>0 && arr[row][col-1] == 1){
                // 계속 왼쪽으로 이동.
                while(col>0 && arr[row][col-1] == 1){
                    col--;
                }
            }
            // 오른쪽에 1이 있으면
            else if(col<99 && arr[row][col+1] == 1){
                while(col<99 && arr[row][col+1] == 1){
                    col++;
                }
            }
            row++;
        }
        return arr[row][col];
    }
}