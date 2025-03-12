import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int intArray[] = new int[N+1];
        
        // 바구니 넘버 부여
        for(int i=1; i<=N; i++){
            intArray[i] = i; 
        }
        
        for(int i=1; i<=M; i++){
            int I = sc.nextInt();
            int J = sc.nextInt();
            int newArray[] = new int[N+1];
            
            // 빈배열에 역순 채우기
            for(int j=J; j>=I; j--){
                newArray[I+J-j] = intArray[j];
            }
            
            // 원본배열에 역순으로 변경하기
            for(int j=I; j<=J; j++){
                intArray[j] = newArray[j];
            }
        }
        
        //출력
        for(int i=1; i<intArray.length; i++){
            System.out.print(intArray[i]+" ");
        }
    }
}