import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String strnum = bf.readLine(); //입력 받은 수 문자열로 받기

            if(strnum.equals("0")) break;
            
            StringBuffer sb = new StringBuffer(strnum);
            String reversed = sb.reverse().toString(); // 뒤집기

            if(strnum.equals(reversed)){
                System.out.println("yes");
            } else{
                System.out.println("no");
            }

        }
    }
}