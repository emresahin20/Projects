import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum=0,count=0,average;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz");
        int num = scan.nextInt();

        for ( int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 4 == 0) {

                System.out.println(i);
                sum=+i;
                count++;
            }
        }
        average=sum/count;
        System.out.println("Ortalama= " + average);
    }
}