import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int B = 42;
        int count = 0;
        boolean[] array = new boolean[42];

        for (int i = 0; i < 10; i++) {
            int A = Integer.parseInt(bf.readLine());
            int remainder = A % B;
            array[remainder] = true;
        }

        for (boolean value : array) {
            if(value){
                count++;
            }
        }

        System.out.println(count);
    }
}
