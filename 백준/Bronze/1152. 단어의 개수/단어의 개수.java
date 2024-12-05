import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();  // 입력 받기, 앞뒤 공백 제거
        if (input.isEmpty()) {
            System.out.println(0);  // 공백만 있는 경우 단어 수 0 출력
        } else {
            String[] words = input.split(" ");  // 공백을 기준으로 단어 분리
            System.out.println(words.length);   // 단어 개수 출력
        }
    }
}
