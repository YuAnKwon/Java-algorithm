import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 1;

        // 3번 반복하여 각 숫자 곱하기
        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(br.readLine());
            result *= num;
        }

        String numStr = Integer.toString(result);

        int array[] = new int[10];

        for(char c : numStr.toCharArray()){
            array[c-'0'] += 1;
        }

        for (int i : array){
            System.out.println(i);
        }
    }
}