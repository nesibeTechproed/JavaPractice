package day1;

public class C03_Print {
    public static void main(String[] args) {

        /*
         Isim, soyisim, yas , boy kilo özelliklerini yalnızca bir printin içerisinde,
        alt alta yazdırın.
         */

        String name="Jack";
        String lastname="Sparrow";
        byte age=44;
        double height=1.85;
        double weight=85;

        System.out.println("İsim : "+name);
        System.out.println("Soyisim : "+lastname);
        System.out.println("Yaş : "+age);
        System.out.println("Boy : "+height);
        System.out.println("Kilo : "+weight);

        System.out.println("***********************************************");

        System.out.println("İsim : "+name+
                          "\nSoyisim : "+lastname+
                          "\nYaş : "+age+
                          "\nBoy : "+height+
                          "\nKilo : "+weight);




    }
}
