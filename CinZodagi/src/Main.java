import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int years;
        System.out.println("Lütfen Doğum yılınızı giriniz: ");
        years = scan.nextInt();

        if (years % 12 ==0){
            System.out.println("Maymun");
        } else if (years % 12 == 1) {
            System.out.println("Horoz");
        }else if (years % 12 == 2) {
            System.out.println("Köpek");
        }else if (years % 12 == 3) {
            System.out.println("Domuz");
        }else if (years % 12 == 4) {
            System.out.println("Fare");
        }else if (years % 12 == 5) {
            System.out.println("Öküz");
        }else if (years % 12 == 6) {
            System.out.println("Kaplan");
        }else if (years % 12 == 7) {
            System.out.println("Tavşan");
        }else if (years % 12 == 8) {
            System.out.println("Ejderha");
        }else if (years % 12 == 9) {
            System.out.println("Yılan");
        }else if (years % 12 == 10) {
            System.out.println("At");
        }else if (years % 12 == 11) {
            System.out.println("Koyun");
        }else {
            System.out.println("Geçersiz Yıl Girdiniz..");
        }
    }
}