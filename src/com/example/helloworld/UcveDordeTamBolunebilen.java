package com.example.helloworld;

import java.util.Scanner;

public class UcveDordeTamBolunebilen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int girilenSayi;

        System.out.println("sayiyi giriniz");
        girilenSayi= input.nextInt();

        for (int i=0;i<=girilenSayi ;i++){
            if (i%3==0) {
                if (i % 4 == 0) {
                    System.out.println(i + " ");
                }
            }
        }
    }
}
