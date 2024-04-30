package day1;

public class C04_Concatination {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Güzel";
        int num1=5;
        int num2=3;

        //Java5
        String str3=str1+num1;
        System.out.println(str1+num1);//"Java5"

        //Java8Güzel
        System.out.println(str1+(num1+num2)+str2);

        //2Güzel15
        System.out.println((num1-num2)+str2+(num1*num2));

        //Java22
        System.out.println(str1+(num1*num1-num2));

        //2.yol
        System.out.println(str1+(num1-num2)+(num1-num2));

        /*
        Java8
        Güzel
         */

        System.out.println(str1+(num2+num1)+"\n"+str2);






    }
}
