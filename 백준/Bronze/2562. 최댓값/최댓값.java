
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0; //최댓값을 저장할 변수.
        int index = 0; // 최댓값의 인덱스를 저장할 변수

        // 9개의 자연수를 입력받고 max보다 값이 크면 갱신
        for (int i = 1; i < 10; i++) {
            int num = sc.nextInt();
            if (num > max) {
                max = num;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
        sc.close();

    }
}

