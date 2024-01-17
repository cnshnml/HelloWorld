package com.example.helloworld;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double minimum=20;
        double acilis=10;
        double kmbasina= 2.30;
        double km;
        double toplam;

        Scanner input= new Scanner(System.in);
        System.out.println("km giriniz");
        km=input.nextDouble();

        toplam =km*kmbasina;
        toplam +=acilis;

        toplam = (toplam<20) ? 20 : toplam;

        System.out.println("ödenecek tutar: " + toplam);

    }
}
