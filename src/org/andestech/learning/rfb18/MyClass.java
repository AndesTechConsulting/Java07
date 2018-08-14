package org.andestech.learning.rfb18;

public class MyClass {

    public static void main(String[] args) {


       // int

       int a1=1, a2=3;
       a2 = 1;

      System.out.println(Integer.MAX_VALUE);
      System.out.println(0b0111_1111_1111_1111_1111_1111_1111_1111);

       // byte

      byte b1 = (byte)(127+1), b2 = -128;
      System.out.println("result: " + b1 );

       //short

      short sh1 = 1<<14;
      System.out.println(Short.MAX_VALUE);

      // long

      long L1=4_000_000_000_000L, L2;
      L2 = 4_000_000_000_000L + 1_234567890_12345678L;
      System.out.println("L2=" + L2);
      System.out.println("Long.MAX_VALUE=" + Long.MAX_VALUE);

      //opers

//      byte bb1 = 0b1001,
//           bb2 = 0b1110,
//           bb3 = bb1 << 1,   res;
//
//      res = (byte)(bb1 & bb2);
//
       int bb1 = 0b1001,
             //<<2 = 0b100100
           bb2 = 0b1110,
           bb3 = bb1 << 2,   res;

      res = 0b10 ^ 0b01;
      bb3 >>=  3;
      //res = ~res;


      // 0b100

      System.out.println("res =" + res + ", " + Integer.toBinaryString(res));
      System.out.println("bb3 =" + bb3 + ", " + Integer.toBinaryString(bb3));

      // floats

      double d1 = 123.13213123, d2 = 1.234567890123456789;
      float f1 = 12.34567890123f, f2 =2.01f, f3 = 1.01f;


      System.out.println("f1=" + (f2 - f3));
      System.out.println("d2=" + d2);

    // chars

       char ch1 = 'A', ch2 = 36522;
       System.out.println("ch1=" + ch1 + ", ch2=" + ch2);
       System.out.println("char max/min: " + (int)(Character.MAX_VALUE) );

    // string

       String s1 = "data string 2";
       s1 += " \"AAA\"";

        System.out.println(s1);

    // boolean

    boolean bool1 = true, bool2 = 1==2;

        System.out.println("bool1=" + bool1);

        boolean bool3 = !(bool2 && bool1);

        System.out.println("bool3=" + bool3);

    // Управление потоком исполнения

     if ( !bool3 ) {
         System.out.println("OK!+++++++++");
         //...
     }
     else  {
         System.out.println("No OK!----------");
         //...
     }


    }
            }
