import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayı Gİriniz: ");
        n = scan.nextInt();

        System.out.println("4 ün Katları");
        int powerOf4 = 1;
        int exponent4=0;
        while (powerOf4<=n){
            System.out.println(powerOf4);
            exponent4++;
            powerOf4=powerOf4*4;
        }
        System.out.println("5in Katları");
        int powerOf5=1;
        int exponent5=0;
        while (powerOf5<=n){
            System.out.println(powerOf5);
            exponent5++;
            powerOf5=powerOf5*5;
        }
    }
}
