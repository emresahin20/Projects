import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double km, price;
        int flightType, age;
        System.out.println("Lütfen Yaşınızı Giriniz: ");
        age = scan.nextInt();
        System.out.println("Lütfen Gideceğiniz Kilometreyi giriniz: ");
        km = scan.nextDouble();
        System.out.println("Lütfen Bilet Seçiniz 1=Tek Gidiş 2=Gidiş-Dönüş: ");
        flightType = scan.nextInt();

        if (km > 0 && age > 0 && (flightType == 1 || flightType == 2)) {
            price = 0.10 * km;
            if (age < 12) {
                price *= 0.5;
            } else if (age < 25) {
                price *= 0.9;
            } else if (age > 65) {
                price *= 0.7;
            }
            if (flightType == 1) {
                price *= 0.8;
                price *= 2;

            }

        System.out.println("Toplam Tutar: " + price + "TL");
    } else{
            System.out.println("Geçersiz Veri!!");
            }
        }

    }
