import java.io.*;

public class Solution{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 테스트 케이스 10번
        for (int i = 1; i <=10 ; i++) {
            int T = Integer.parseInt(br.readLine()); // 테스트 케이스
            char[][] arr = new char[100][100];

            // 글자판 배열 생성
            for (int j = 0; j < 100; j++) {
                String strings = br.readLine();
                arr[j] = strings.toCharArray();
            }

            int max = 1;

            // 가로로 이어진 회문
            for (int length = 1; length <= 100; length++) {
                for (int j = 0; j < 100; j++) {
                    for (int k = 0; k < 100 - length + 1 ; k++) {
                        if(isPalindromeRow(arr, length, j, k)){
                            if (length > max) max = length;
                        }
                    }
                }

                for (int j = 0; j < 100-length+1 ; j++) {
                    for (int k = 0; k < 100; k++) {
                        if(isPalindromeCol(arr, length, j, k)){
                            if (length > max) max = length;
                        }

                    }
                }
            }

            bw.write("#"+ T + " " + max + "\n");
        }
        bw.close();
        br.close();
    }

    static boolean isPalindromeRow(char[][] arr, int length, int j, int k) {
        for (int i = 0; i < length / 2; i++) {
            if(arr[j][k + i] != arr[j][k + length - 1 - i]){
                return false;
            }
        }
        return true;
    }

    static boolean isPalindromeCol(char[][] arr, int length, int j, int k) {
        for (int i = 0; i < length / 2; i++) {
            if(arr[j+ i][k] != arr[j + length - 1 - i][k]){
                return false;
            }
        }
        return true;
    }
}