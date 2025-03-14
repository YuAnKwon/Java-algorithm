import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String S = bf.readLine();

        int[] array = new int[26];
        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
            int index = S.charAt(i) - 'a';
            if(array[index] == -1){
                array[index] = i;
            }
        }

        for (int value : array){
            System.out.print(value + " ");
        }
    }
}