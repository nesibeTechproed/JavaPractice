package day1;

import java.util.Scanner;

public class C07_IfElse {
    public static void main(String[] args) {

           /*
        kullanıcıdan bir tam sayı isteyiniz:
        sayının pozitif, negatif veya nötr olduğunu kontrol edip
        yazdıralım.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen bir tam sayı giriniz : ");
        int sayi= scanner.nextInt();
        //boolean isGraterThanZero=sayi>0;//T,F
        //System.out.println(isGraterThanZero);

        if(sayi>0){
            System.out.println("Sayı POZİTİF");
        }else if(sayi<0){
            System.out.println("Sayı NEGATİF");
        }else {
            System.out.println("Sayı NÖTR");
        }



    }
}
