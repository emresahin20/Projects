import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kdvOranı = 0.18 , tutar;
        Scanner scan = new Scanner(System.in);
        System.out.println("Toplam Tutar= ");
        tutar = scan.nextDouble();

        double kdvTutar = tutar * kdvOranı;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("Kdvli Tutar= " + kdvliTutar);
        System.out.println("Kdvsiz Tutar= " + tutar);
        System.out.println("Kdv Oranı= " + kdvOranı);
        System.out.println("Kdv Tutar= "+ kdvTutar);


    }
}