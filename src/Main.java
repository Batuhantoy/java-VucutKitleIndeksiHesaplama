import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Değişkenler
        double boy,kilo;
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan bilgileri al
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy=input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo=input.nextDouble();

        //Hesapla
        double vucutKitleIndeksi = kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz : "+vucutKitleIndeksi);
    }
}