package com.example.helloworld;

import java.util.Scanner;

public class TekSayilarinToplami {
   // public static void main(String[] args) {
   //     Scanner input= new Scanner(System.in);
   //     int sayi, toplam;
   //     toplam=0;
   //     System.out.println("sayiyi giriniz");
   //     sayi=input.nextInt();
   //      for (int i=0 ; i<=sayi ; i++)
   //      {
   //          if(i%2==1){
   //              toplam +=i;
   //          }
   //      }
   //     System.out.println("tek sayilarin toplami: " +toplam);
//
   // }


    //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
    //ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int sayi, toplam;
        toplam=0;

        do {
            System.out.println("sayi giriniz");
            sayi= input.nextInt();
            if (sayi%2==0 && sayi%4==0){
                toplam += sayi;
                //System.out.println("sayi: "+sayi +" " + toplam);
            }
        }
        while (sayi%2==0);

        System.out.println("sayıların toplamı " +toplam);
    }
}
