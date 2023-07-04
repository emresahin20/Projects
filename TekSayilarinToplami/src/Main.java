import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.println("Lütfen Bir Sayı Giriniz (İşlemi Sonlandırmak İçin 0 a Basınız) :");
            number = scan.nextInt();
            if (number % 2 == 0 && number % 4 == 0){
                sum +=number ;
            }

        }while (number != 0);
            System.out.println("Girilen Çift Ve 4ün katı Olan Sayıların Toplamı =" + sum);

    }
}