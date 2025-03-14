import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());

        // 테스트 횟수만큼 반복
        for (int i = 0; i < T; i++) {
            String input = bf.readLine();

            int score = 0; // 최종 점수
            int count = 0; // 연속된 수

            for (int j = 0; j < input.length(); j++) {
                if(input.charAt(j) == 'O'){
                    count++;
                    score += count;
                } else{
                    count = 0;
                }
            }
            System.out.println(score);
        }
    }
}