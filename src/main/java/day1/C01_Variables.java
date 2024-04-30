package day1;

public class C01_Variables {

    //psvm/main
    public static void main(String[] args) {
        //Bir yaş variable'ı oluştur ve yazdır.
        byte age=21;

        System.out.println("18");//hard coding
        System.out.println("Yaş : "+age);//dinamik coding

        //Bir sayı variable'ı oluştur ve yazdır.
        int number=12345;

        System.out.println("number = " + number);

        //bir myAge isminde variable oluştur, mevcut olan age değişkeninin değerini ata.
        byte myAge=age;
        System.out.println("benim yaşım: "+myAge);

        //bir isim variable ı oluştur, yazdır
        String name="Jack";
        System.out.println("isim : "+name);

        //myName variable ı oluştur, mevcut name değişkeninin değerini ata.
        String myName=name;//Jack
        System.out.println("name = " + name);//Jack
        System.out.println("myName = " + myName);//Jack

        name="Harry";
        System.out.println("name = " + name);//Harry
        System.out.println("myName = " + myName);//Jack


    }


}
