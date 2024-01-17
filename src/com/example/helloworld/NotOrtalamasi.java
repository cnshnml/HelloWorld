package com.example.helloworld;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        //değişkenler
        int mat, fizik, kimya, turkce, tarih;

        Scanner scan=new Scanner(System.in);

        //degerleri al
        System.out.println("mat notu giriniz");
        mat = scan.nextInt();
       // System.out.println("mat notunuz: " +mat);

        System.out.println("fizik notu giriniz");
        fizik = scan.nextInt();
        //System.out.println("fizik notunuz: " +fizik);

        System.out.println("kimya notu giriniz");
        kimya = scan.nextInt();
        //System.out.println("kimya notunuz: " +kimya);

        System.out.println("tarih notu giriniz");
        tarih = scan.nextInt();
       // System.out.println("mat notunuz: " +tarih);

        //int toplam=(mat+fizik+kimya+tarih);
        double ortalama = (mat+fizik+kimya+tarih)/4;

        System.out.println("ortalamanız: " +ortalama );

        boolean kosul = ortalama>=60;
       // boolean basarisiz = ortalama<60;

        String str =(kosul) ? "Öğrenci başarılı olmuştur" : "Öğrenci başarısız olmuştur";
        System.out.println(str);




    }
}
