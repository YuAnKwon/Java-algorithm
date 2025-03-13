import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 테스트 케이스의 개수
        int T = Integer.parseInt(br.readLine());
        
        // 각 테스트 케이스 처리
        for (int i = 0; i < T; i++) {
            // 입력 받기
            String[] input = br.readLine().split(" ");
            int R = Integer.parseInt(input[0]); // 반복 횟수
            String S = input[1]; // 문자열 S
            
            // 결과 문자열 만들기
            StringBuilder result = new StringBuilder();
            for (char c : S.toCharArray()) {
                for (int j = 0; j < R; j++) {
                    result.append(c);
                }
            }
            
            // 결과 출력
            System.out.println(result.toString());
        }
    }
}
