import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        int num = scan.nextInt();
        double result=0;


        for(double i = 1; i<=num ; i++){
            result =result+ (1/i);
        }
        System.out.println("Sonuç :" + result);
    }
}