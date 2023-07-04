import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName;
        String password;
        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanıcı Adınızı Giriniz:");
        userName= scan.nextLine();
        System.out.println("Şifrenizi Giriniz:");
        password=scan.nextLine();
        if (userName.equals("EmreSahin") && password.equals("Emres0258")){
            System.out.println("Giriş Başarılı...");
        }
        else {
            System.out.println("Giriş Başarısız.");
            System.out.println("Sifrenizi Değiştirmek İster misiniz Evet/Hayır.");
            String cevap= scan.nextLine();
            switch (cevap){
                case "Evet":
                    System.out.println("Yeni Şifrenizi Giriniz: ");
                    String newPassword = scan.nextLine();
                    if (newPassword.equals("Emres0258")){
                        System.out.println("Yeni Şifreniz Eski Şifrenizle Aynı Olamaz");
                    }
                    else {
                        System.out.println("Şifreniz Başarıyla Değiştirildi");
                    }
                break;
                case"Hayır":
                    System.out.println("2 Saniye sonra tekrar deneyebilirsiniz");
                    break;
                default:
                    System.out.println("Lütfen Şifrenizi Veya Kullanıcı Adınızı Kontrol Ediniz");
            }
        }
    }
}