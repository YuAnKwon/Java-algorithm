import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        String sum = "";
        for(int i=0; i<a; i++){
            sum += "*";
            System.out.println(sum);
        }

        sc.close();
    }
}
