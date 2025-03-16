import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bf.readLine());

        int level = 1; // 층 수
        int current = 1;

        while(current < num){
            current += level * 6;
            level ++;
        }

        if(num == 1){
            System.out.println(1);
        } else{
            System.out.println(level);
        }
    }
}

