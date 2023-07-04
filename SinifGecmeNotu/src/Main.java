import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mat,fizik,kimya,müzik;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Matematik Notunuzu Giriniz: ");
        mat = scan.nextDouble();
        System.out.println("Lütfen Fizik Notunuzu Giriniz: ");
        fizik= scan.nextDouble();
        System.out.println("Lütfen Kimya Notunuzu Giriniz: ");
        kimya=scan.nextDouble();
        System.out.println("Lütfen Müzik Notunuzu Giriniz: ");
        müzik= scan.nextDouble();

       double avarge =(mat+fizik+kimya+müzik)/5;
       if (avarge>=55){
           System.out.println("Tebrikler Geçtiniz ,Ortalamanız: "+avarge);
       }
        else {
            System.out.println("Malesef Sınıf Geçmek İçin Uygun Değilsiniz ,Ortalamanız: "+avarge);
       }
    }
}