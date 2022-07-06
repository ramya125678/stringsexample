package Stringspractice;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Locale;

public class Stringexample {
   static String s1="Ramya";
     static String s2="I love my world";

     static  String firstname="mani";

     static  String lastname="kanta";

    static  String fullname="manikanta";

    String s4="maddula";//non static method//

    static String s5="sreenivas";

    static String s6="sreenivas";


    public static void main(String[] args) {
        System.out.println(s1.length());
        System.out.println(s2.length());
       //System.out.println(s1.toUpperCase());//
        String r = s1.toUpperCase();
        System.out.println(r);
        System.out.println(s1.toLowerCase());
        System.out.println(s2.contains("world"));
        System.out.println(s1.concat(firstname+lastname));
        int len=s2.length();
        System.out.println(len);
        //fullname=firstname.concat(lastname);//
          fullname=firstname+lastname;
        System.out.println(fullname);
        System.out.println("full name of the string is:"+fullname);
         String s3=new String("i love my world");
         System.out.println(s3.length());
        System.out.println(s3.contains("world"));
         Stringexample obj=new Stringexample();    //static method calls//
         String t=obj.s4;
         System.out.println(t.length());
         System.out.println(s5==s6);
         String s7=new String("my name is ramya");
        String s8=new String("my name is ramya");
        System.out.println(s7.equals(s8));
        //System.out.println(s7.contentEquals(s8));//
        String s9=new String("my name is ramya");
        String s10=new String("my name is RAMYA");
        System.out.println(s9.equalsIgnoreCase(s10));
        System.out.println(s9.indexOf("name"));
        System.out.println(s9.indexOf('a'));
        System.out.println(s9.indexOf('a',0));
        System.out.println(s9.indexOf("am",5));  //character or string certain position after calculation//
        System.out.println(s9.substring(4));
        System.out.println(s9.substring(5,7));

        int position=s9.indexOf('y');
         System.out.println("y position"+position);

         int startposition=s9.indexOf("ramya");
        System.out.println( "ramya position"+startposition);

        int endingposition=s9.indexOf('m',startposition);
        System.out.println("m index"+endingposition);


        System.out.println(s9.substring(startposition));
        System.out.println(s9.substring(startposition,endingposition));

        String s11= new String("ramya666");
        //String substring =s11.substring(s11.indexOf(7))//

        char[] s=s11.toCharArray();
        System.out.println(s.length);

        System.out.println(s[0]);   //starting index position//

        System.out.println(s[s.length-1]);    //last character position theliyadaniki//

         String s12= new String("i love my india");   //
         String[] splitedstring =s12.split(" ");
         System.out.println(splitedstring[0]);
        System.out.println(splitedstring[1]);
        System.out.println(splitedstring[2]);
        System.out.println(splitedstring[3]);

    }
}