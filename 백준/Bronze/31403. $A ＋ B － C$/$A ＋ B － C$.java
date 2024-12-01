import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        System.out.println(A+B-C); // int일때

        String StrA = Integer.toString(A);
        String StrB = Integer.toString(B);

        System.out.println((Integer.parseInt(StrA + StrB)) - C);
        sc.close();

    }
}

