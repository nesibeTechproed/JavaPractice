package day1;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        //TASK 3:Yarıçapı r olan dairenin alanını bulan kodu yazınız.
        //𝜋 sayısını = 3.14 alınız.
        //Formül : 𝜋 * (r*r)

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yarıçap bilgisini giriniz : ");
        double yaricap=scan.nextDouble();
        double pi=3.14;
        double alan=pi*yaricap*yaricap;

        System.out.println("Dairenin alanı : "+alan);


        //TASK 4:otomatik öğrenci numarası oluşturunuz
        //format:bölüm isminin ilk harfi+giriş yılı+kayıt sırası
        //örnek:Y20245

        System.out.print("Lütfen bölüm isminin ilk harfini giriniz : ");
        String bolum=scan.next();
        System.out.print("Lütfen giriş yılını giriniz : ");
        int yil= scan.nextInt();;
        System.out.print("Lütfen kayıt sıranızı giriniz : ");
        int sira= scan.nextInt();

        System.out.println("Öğrenci numaranız : "+(bolum+yil+sira));


    //ÖDEV: bir ürünün kdv li fiyatını hesaplayınız:kdv oranı=0.8
    //ürün fiyatı kullanıcıdan alınacak
    //kdv miktarı=ürün fiyatı* kdv oranı
    //toplam fiyat=ürün fiyatı+kdv miktarı



    }
}
