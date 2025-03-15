import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 참가자 수
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] sizeArr = new int[6];
        // 사이즈별 신청자 수
        for (int i = 0; i < sizeArr.length; i++) {
            sizeArr[i] = Integer.parseInt(st.nextToken());
        }

        // 티셔츠와 펜의 묶음 수
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        // 티셔츠
        int tShirt = 0;
        for(int value : sizeArr){
            tShirt += value/T;
            tShirt += value % T ==0 ? 0: 1;
        }
        System.out.println(tShirt);

        // 펜
        System.out.printf("%d %d", N/P, N%P);

    }
}