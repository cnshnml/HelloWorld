package com.example.helloworld;

public class HarmonikSayi {
    public static void main(String[] args) {
        double sayi=4;
        double eleman;
        double harmonik=0;


            for (double j=1 ; j<=sayi ; j++){
                eleman=1/j;
                //System.out.println(sonuc);
                harmonik += eleman;
                //System.out.println(harmonik);

            }


        System.out.println("harmonik sayı sonucu: " +harmonik);

    }
}
