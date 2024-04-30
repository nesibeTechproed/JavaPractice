package day1;

public class C02_Ortalama {
    public static void main(String[] args) {

        double num1=12.4;
        double num2=25.8;
        double num3=800;
        double num4=8.3;
        double num5=105.3;

        //yukarıdaki sayıların ortalamasını bulan kodu yazalım.
        //tüm sayıları toplayıp sayı adedine bölelim

        ///1.yol
        System.out.println("toplam :"+(num1+num2+num3+num4+num5));
        System.out.println("ortalama :"+(num1+num2+num3+num4+num5)/5);

        //2.yol
        double total=num1+num2+num3+num4+num5;
        double avarage=total/5;
        System.out.println("toplam : "+total);
        System.out.println("ortalama : "+avarage);



    }
}
