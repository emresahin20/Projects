import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy,kilo;
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Boyunuzu Giriniz= ");
        boy= scan.nextDouble();

        System.out.println("Lütfen Kilonuzu Giriniz= ");
        kilo= scan.nextDouble();

        double kitleİndex = boy*boy/kilo;
        System.out.println("Vücut Kitle İndexiniz= "+ kitleİndex);
    }
}