import java.io.*;
import java.util.*;

public class Solution{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i <= 10; i++) {
            int T = Integer.parseInt(br.readLine()); // 테스트 케이스
            String str = br.readLine(); // 찾을 문자열
            String strings = br.readLine(); // 검색할 문장

            // str 문자열이 포함되어있으면
            int count = 0; // 문자열 횟수
            while(strings.contains(str)){
                // 몇번반복되는지 출력이니까. 해당 문자열이 나오면 count올리고 자르고 올리고 자르고 하면 될듯.
                int firstIndex = strings.indexOf(str);
                int lastIndex = firstIndex + str.length();
                strings = strings.substring(lastIndex);
                count++;
            }
            bw.write("#" + T + " " + count + "\n");
        }
        bw.flush();
        bw.close();
    }
}