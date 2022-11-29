import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName,password,cevap,newPassword,originalPassword="101",originalUsername ="patika";

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz:");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz:");
        password = input.nextLine();

        if(userName.equals(originalUsername) && password.equals((originalPassword)) ) {

            System.out.println("Giriş yaptınız .");
        }
        else {
                System.out.print("Yanlış şifre girdiniz.Şifrenizi sıfırlamak istermisiniz? :(evet / hayır) :");

                cevap = input.nextLine();
                if (cevap.equals("evet")) {
                    System.out.print("Yeni şifrenizi giriniz:");
                    newPassword = input.nextLine();
                    if (newPassword.equals(originalPassword)) {
                        System.out.print("Yeni girdiğiniz şifre hatalı.Girilen şifre unutulan şifreyle aynı olamaz.Tekrar giriniz:");
                        newPassword = input.nextLine();
                    }
                        else {
                        System.out.println("Şifre oluşturuldu.");
                    }

                }
            }

        }

    }

