package com.example.helloworld;

import java.util.Scanner;

public class IkininKuvvetleri {
    public static void main(String[] args) {
      //  Scanner input = new Scanner(System.in);
      //  System.out.println("sayi giriniz");
      //  int n= input.nextInt();
//
      //  for (int i=0; i<=n; i++) {
      //      if (Math.pow(2, i) <= n) {
      //          System.out.println(Math.pow(2, i));
      //      }
      //  }


        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        Scanner sayi = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int m= sayi.nextInt();

        for (int i=0; i<=m; i++) {
            if (Math.pow(4, i) <= m) {
                if (Math.pow(5, i) <= m) {
                System.out.println(Math.pow(4, i) + " " + Math.pow(5,i));
            }}

        }
    }



}
