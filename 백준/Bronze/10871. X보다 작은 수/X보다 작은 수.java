import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, X;

        N = sc.nextInt();
        X = sc.nextInt();

        for (int i=0; i<N; i++){
            int num = sc.nextInt();
            if(num<X){
                System.out.printf("%d ", num);
            }
        }

        sc.close();
    }
}
