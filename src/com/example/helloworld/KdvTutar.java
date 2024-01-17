package com.example.helloworld;

import java.util.Scanner;

public class KdvTutar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double tutar;

        System.out.println("tutarı giriniz: ");
        tutar= scan.nextInt();

        double kdvsiz=tutar;
        double kdvli = (tutar*118/100);


        System.out.println("yeni tutar: " +kdvli);

    }
}
