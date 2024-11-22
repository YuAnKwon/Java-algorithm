import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자 입력 받기
        char inputChar = sc.nextLine().charAt(0);

        // 문자에 해당하는 아스키 코드 출력
        System.out.println((int) inputChar);
    }
}