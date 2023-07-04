import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut=2.14,
                elma=3.67,
                domates=1.11,
                muz=0.95,
                patlican=9.00;

        Scanner scan = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo?");
        double armutKilo = scan.nextDouble();
        double armutTutar= armutKilo*armut;

        System.out.println("Elma Kaç Kilo?");
        double elmaKilo = scan.nextDouble();
        double elmaTutar=elmaKilo*elma;

        System.out.println("Domates Kaç Kilo?");
        double domatesKilo = scan.nextDouble();
        double domatesTutar= domatesKilo*domates;

        System.out.println("Muz Kaç Kilo?");
        double muzKilo = scan.nextDouble();
        double muzTutar= muz*muzKilo;

        System.out.println("Patlican Kaç Kilo?");
        double patlicanKilo = scan.nextDouble();
        double patlicanTutar=patlicanKilo*patlican;

        System.out.println("Armut Kaç Kilo?"+armutKilo);
        System.out.println("Elma Kaç Kilo?"+elmaKilo);
        System.out.println("Domates Kaç Kilo?"+domatesKilo);
        System.out.println("Muz Kaç Kilo?"+muzKilo);
        System.out.println("Patlican Kaç Kilo?"+patlicanKilo);

        double toplam = armutTutar+elmaTutar+domatesTutar+muzTutar+patlicanTutar;
        System.out.println(toplam);




    }
}