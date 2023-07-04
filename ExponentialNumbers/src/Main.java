import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Üssü alınacak sayıyı giriniz: ");
        int n = scan.nextInt();
        System.out.println("Üssü giriniz: ");
        int k = scan.nextInt();
        int total =1;
        for (int i =1 ; i <=k; i++){
            total = total * n;

        }
        System.out.println("Sonnuç: " + total);
    }
}