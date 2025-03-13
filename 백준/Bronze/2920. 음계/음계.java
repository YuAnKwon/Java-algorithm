import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int intArray[] = new int[8];
        int tokenlength = st.countTokens();

        // 배열에 숫자 넣기
        for(int i=0; i<tokenlength; i++){
            intArray[i] = Integer.parseInt(st.nextToken());
        }

        String result = "";

        //오름차순인지 내림차순인지 판단
        for(int i=0; i<intArray.length-1; i++){
            if(intArray[i] + 1 == intArray[i+1]){
                result = "ascending";
            } else if(intArray[i] - 1 == intArray[i+1]){
                result = "descending";
            } else{
                result = "mixed";
                break;
            }
        }
        System.out.print(result);
    }
}