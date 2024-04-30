package day1;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {


        //TASK1:kullanıcıdan bir tam sayı alıp, sayının karesini yazdıralım
        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz : ");
        int number=input.nextInt();

        System.out.println("Sayının karesi : "+(number*number));

        //TASK2:Kullanicidan kilosunu ve boyunu alin, vucut kitle indeksini yazdıralım.
        //kilo/(boyun karesi)

        System.out.println("Lütfen kilo bilgisini kg olarak giriniz : ");
        double kilo=input.nextDouble();

        System.out.println("Lütfen boy bilgisini m olarak giriniz : ");
        double boy=input.nextDouble();

        double vki=kilo/(boy*boy);

        System.out.println("Vücut kitle indeksi : "+vki);







    }
}
