import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double taksimetreAçılış=10,kmBaşı =2.20;
        Scanner scan= new Scanner(System.in);

        System.out.println("Gidilecek Kilometreyi Giriniz= ");
        double gidilecekKilometre = scan.nextDouble();

        double kmTutar= kmBaşı * gidilecekKilometre;
        double tutar = taksimetreAçılış + kmTutar;

        tutar = (tutar<20) ? 20 :tutar;
        System.out.println("Gidilecek Yolun Parası= "+kmTutar);
        System.out.println("Toplam Tutar= "+tutar);
    }
}