import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();

        min = min - 45;

        if(min<0){
            min = 60 + min;
            hour = hour - 1;

            if(hour==-1){
                hour = 23;
            }
        }
        System.out.println(hour + " " + min);


        sc.close();

    }
}

