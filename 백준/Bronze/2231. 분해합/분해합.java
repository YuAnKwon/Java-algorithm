import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(bf.readLine());
        int result = 0;

        for (int i = 1; i < num; i++) {
            int sum = 0;
            int number = i;

            while(number !=0){
                sum+= number % 10;
                number = number / 10;
            }

            if (sum + i == num){
                result = i;
                break;
            }
        }
        System.out.print(result);
    }
}
