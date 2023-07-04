import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int cografya,turkce,mat,fizik,kimya;
        Scanner scan = new Scanner(System.in);

        System.out.println("Coğrafya Notunuz= ");
        cografya= scan.nextInt();

        System.out.println("Türkçe Notunuz= ");
        turkce= scan.nextInt();

        System.out.println("Matematik Notunuz= ");
        mat = scan.nextInt();

        System.out.println("Fizik Notunuz= ");
        fizik = scan.nextInt();

        System.out.println("Kimya Notunuz= ");;
        kimya = scan.nextInt();

        int toplam =cografya+turkce+mat+fizik+kimya;
        double ortalama= toplam /5;
        System.out.println(ortalama);
    }
}