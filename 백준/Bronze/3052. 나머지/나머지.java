import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int B = 42;
        int[] array = new int[10];
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            int A = Integer.parseInt(bf.readLine());
            int remainder = A % B;

            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if(array[j] == remainder){
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate){
                array[count] = remainder;
                count++;
            }
        }
        System.out.println(count);
    }
}
