import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bulunduğunuz Bölgedeki Sıcaklığı Giriniz:");
        heat = scan.nextInt();
        if (heat<=5){
            System.out.println("Kayak İçin Uygun Hava");
        } else if (heat>=5 && heat<=15) {
            System.out.println("Sinema İçin Uygun Hava");
        } else if (heat>=15 && heat<=25) {
            System.out.println("Piknik İçin Uygun Hava");
        }else{
            System.out.println("Yüzmek İçin Uygun Hava");
        }
    }
}