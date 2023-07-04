import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total=0;
        System.out.println("Lütfen bir sayı giriniz : ");
        int num= scan.nextInt();

        while (num>0){
            int basamak = num %10;
            total += basamak;
            num /=10;

        }
        System.out.println("Basamakların Toplamı " + total);
    }
}