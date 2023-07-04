import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayı1,sayı2,islem ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        sayı1 = scan.nextInt();
        System.out.println("Bir Sayı Giriniz: ");
        sayı2= scan.nextInt();

        System.out.println("Bir İşelem Seçiniz:" +
                "\n1=Toplama" +
                "\n2=Çıkarma" +
                "\n3=Bölme" +
                "\n4=Çarpma");
        islem= scan.nextInt();

        switch (islem){
            case 1:
                System.out.println("Toplama İşlemi Sonucu: " + (sayı1+sayı2));
            break;
            case 2:
                System.out.println("Çıkarma İşlemi Sonucu: " + (sayı1-sayı2));
                break;
            case 3:
                System.out.println("Bölme İşlemi Sonucu: " + (sayı1/sayı2));
                break;
            case 4:
                System.out.println("Çarpma İşlemi Sonucu: " + (sayı1*sayı2));
                break;
            default:
                System.out.println("Geçersiz İşlem Seçtiniz.Lütfen İşleminizi Kontrol Ediniz...");
                break;
        }

        }
    }
