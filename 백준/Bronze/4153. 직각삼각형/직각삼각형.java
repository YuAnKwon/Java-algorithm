import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            // 000이 입력받을시 종료
            if (A==0 && B==0 && C==0){
                break;
            }

            // 직사각형인지 판별
            int[] array = {A, B, C};
            Arrays.sort(array);
            int a = array[0];
            int b = array[1];
            int c = array[2];

            if (a*a + b*b == c*c){
                System.out.println("right");
            } else{
                System.out.println("wrong");
            }
        }
    }
}