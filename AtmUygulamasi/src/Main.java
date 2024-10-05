import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // samet sökütlü  : iban TR1234 000 567 985 345 6572 23 45
        // ahmet kurt     : iban TR1265 0780 127 985 345 7572 13 89
        /*
         *samet in kullanıcı adı ve şifresi :samet58 --456
         * ahmet in kullanıcı adı ve şifresi : ahmet34 --123
         *Bakiye görüntülemek için -->1
         * para çekmek için --------->2
         * farklı hesaba para yatırmak için --->3
         * uygulmadan çıkmak için -------->q ' tuşuna basınız
         */
        String islemSeçenekleri = "bakiye görüntülemek için -->1" +
                "paraçekmek için ---2" +
                "farklı hesaba para yatırmak için ---3"
                + "cıkış için q tuşuna basınız";
        Scanner scanner = new Scanner(System.in);
        double sametBakiye = 2450;
        String sametIban = "TR1234 000 567 985 345 6572 23 45";
        String sametKullanici = "samet58";
        String sametSifre = "456";

        double ahmetBakiye = 1200;
        String ahmetIban = "TR1265 0780 127 985 345 7572 13 89";
        String ahmetKullanici = "ahmet34";
        String sifreBakiye = "123";

        System.out.println("atm ye hoş geldiniz ");
        System.out.println("lütfen bilgileriniz girin");
        System.out.println("kullanıcı adınızı girin");
        String kullaniciAdi = scanner.nextLine();
        System.out.println("şifrenizi girin");
        String sifre = scanner.nextLine();

        if (kullaniciAdi.equals("samet58") && sifre.equals("456")) {
            System.out.println("Samet sökütlü hesabına giriş yapıldı");
            System.out.println(islemSeçenekleri);
            System.out.print("lütfen bir seçim yapınız");
            String secim = scanner.nextLine();
            switch (secim) {
                case "1":
                    System.out.println("bakiyeniz" + sametBakiye);
                    break;
                case "2":
                    System.out.println("çekmek istediginiz tutarı giriniz :");
                    int cekilecekTutar = scanner.nextInt();
                    if (sametBakiye > cekilecekTutar) {
                        sametBakiye -= cekilecekTutar;
                        System.out.println("kalan tutar :" + sametBakiye);
                    } else {
                        System.out.println("yetersiz bakiye");
                    }
                    break;
                case  "3" :
                    System.out.println("ne kadar yapmak istiyorsunuz :");
                    int yatirilacakTutar = scanner.nextInt();
                    if (yatirilacakTutar<=sametBakiye)
                    {
                        System.out.println("iban giriniz :");
                        scanner.nextLine();
                        String yatirilacakİban=scanner.nextLine();
                        if (yatirilacakİban.equals(ahmetIban)) {
                            System.out.println("para yatırılıyor");
                            sametBakiye-=yatirilacakTutar;
                            ahmetBakiye+=yatirilacakTutar;
                            System.out.println("bakiyeniz"+sametBakiye);
                            System.out.println("ahmet bakiye"+ahmetBakiye);
                        }

                    }
                    break;
            }


        } else if (kullaniciAdi.equals("ahmet34") && sifre.equals(123)) {
            System.out.println("ahmet kurt hesabına giriş yapıldı");
            System.out.println(islemSeçenekleri);
        } else {
            System.out.println("kullanıcı adı şifre yanlış");
        }


    }
}