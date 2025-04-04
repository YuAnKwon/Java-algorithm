import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스 수 T
        int T = 10;
        // T만큼 반복
        for (int i = 1; i <= T; i++) {
            // 빌딩 개수
            int buildingNum = Integer.parseInt(br.readLine());
            // 빌딩 높이를 담을 배열
            int[] buildingArr = new int[buildingNum];

            StringTokenizer st = new StringTokenizer(br.readLine());

            // 빌딩 개수만큼 반복
            for (int j = 0; j < buildingNum; j++) {
                buildingArr[j] = Integer.parseInt(st.nextToken()); // 배열에 담기
            }

            // 최종 결과
            int result = 0;
            // 빛 들어오는 곳 구하기
            for (int j = 2; j < buildingArr.length-2; j++) {
                // 좌우로 2칸 이상의 공백이 존재하나?
                // 가장 높은 빌딩 하나만 비교하기
                int max_height = Math.max(
                        Math.max(buildingArr[j - 2], buildingArr[j - 1]),
                        Math.max(buildingArr[j + 1], buildingArr[j + 2])
                );
                // 가장 높은 빌딩과 현재 빌딩 뺀 값.
                if(buildingArr[j] > max_height){
                    result += buildingArr[j] - max_height;
                }
            }
            System.out.printf("#%d %d\n", i, result);
        }
    }
}