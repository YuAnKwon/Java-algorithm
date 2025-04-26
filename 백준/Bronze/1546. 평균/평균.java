import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 시험 본 과목 개수 N
        StringTokenizer st = new StringTokenizer(br.readLine()); // 현재 성적

        // 점수 배열
        int[] arr = new int[N];
        int M = 0; // 점수 중 최댓값

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // 배열에 점수 추가
            if (M < arr[i]) M = arr[i]; // 최댓값 구하기
        }

        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (double) arr[i] / M * 100;
        }

        double average = sum / N;

        bw.write(average+"\n"); // 평균 구하기

        bw.close();
        br.close();
    }
}
