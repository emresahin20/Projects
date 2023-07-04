import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int year;
        System.out.println("Lütfen Artık Yıl İçin Yıl Giriniz: ");
        year=scan.nextInt();

        if (year % 4==0 && year % 100 !=0 || year % 400 ==0){
            System.out.println("Artık Yıl.");
        }else {
            System.out.println("Artık Yıl Değil.");
        }
    }
}