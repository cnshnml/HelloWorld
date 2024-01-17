package com.example.helloworld;

import java.util.Scanner;

public class GirilenSayiyaKadarCiftBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int girilenSayi;

        System.out.println("sayiyi giriniz");
        girilenSayi= input.nextInt();

        for (int i=0;i<=girilenSayi ;i++){
            if (i%2==0){
                System.out.println(i + " ");
            }
        }

    }
}
