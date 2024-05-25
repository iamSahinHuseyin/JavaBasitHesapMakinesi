

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Kullanıcıya işlem seçimini sor
        islemSecimi();

        int islemSecim = sc.nextInt();

        // İşlem seçimine göre hareket et
        switch (islemSecim) {
            case 1:
                System.out.println("Toplama işlemi seçildi.");
                toplamaIslemi(sc);
                break;
            case 2:
                System.out.println("Çıkarma işlemi seçildi.");
                cikarmaIslemi(sc);
                break;
            case 3:
                System.out.println("Çarpma işlemi seçildi.");
                carpmaIslemi(sc);
                break;
            case 4:
                System.out.println("Bölme işlemi seçildi.");
                bolmeIslemi(sc);
                break;
            default:
                System.out.println("Geçersiz işlem seçimi.");
                break;
        }
    }

    // Kullanıcıya işlem seçimini göster
    public static void islemSecimi() {
        System.out.println("Yapmak istediğiniz işlemi seçiniz: \n" +
                "1: Toplama\n" +
                "2: Çıkarma\n" +
                "3: Çarpma\n" +
                "4: Bölme\n");
    }

    // Toplama işlemi
    public static void toplamaIslemi(Scanner sc) {
        System.out.print("Kaç sayı toplayacaksınız? ");
        int adet = sc.nextInt();
        int toplam = 0;
        for (int i = 0; i < adet; i++) {
            System.out.print("Sayi" + (i + 1) + ": ");
            int sayi = sc.nextInt();
            toplam += sayi;
        }
        System.out.println("Toplam: " + toplam);
    }

    // Çıkarma işlemi
    public static void cikarmaIslemi(Scanner sc) {
        System.out.print("Sayi1: ");
        int sayi1 = sc.nextInt();
        System.out.print("Sayi2: ");
        int sayi2 = sc.nextInt();
        System.out.println("Fark: " + (sayi1 - sayi2));
    }

    // Çarpma işlemi
    public static void carpmaIslemi(Scanner sc) {
        System.out.print("Kaç sayı çarpacaksınız? ");
        int adet = sc.nextInt();
        int carpim = 1;
        for (int i = 0; i < adet; i++) {
            System.out.print("Sayi" + (i + 1) + ": ");
            int sayi = sc.nextInt();
            carpim *= sayi;
        }
        System.out.println("Çarpım: " + carpim);
    }

    // Bölme işlemi
    public static void bolmeIslemi(Scanner sc) {
        System.out.print("Sayi1: ");
        int sayi1 = sc.nextInt();
        System.out.print("Sayi2: ");
        int sayi2 = sc.nextInt();
        if (sayi2 != 0) {
            System.out.println("Bölüm: " + (sayi1 / sayi2));
        } else {
            System.out.println("Sıfıra bölme hatası!");
        }
    }
}

