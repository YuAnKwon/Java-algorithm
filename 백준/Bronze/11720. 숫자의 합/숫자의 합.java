import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받은 수의 길이
        int len = sc.nextInt();
        // 숫자 N을 공백없이 읽는다.
        String N = sc.next();

        // 합계 sum
        int sum = 0;
        // N의 각 문자를 하나씩 읽어 합산.
        for(int i=0; i<len; i++){
            int c = Character.getNumericValue(N.charAt(i));
            sum +=c;
        }
        System.out.println(sum);
        sc.close();

    }
}

