package com.example.helloworld;

import java.util.Scanner;

public class EtkinlikOner {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double sicaklik;


        System.out.println("sıcaklık giriniz: ");
        sicaklik= input.nextDouble();

        if (sicaklik<5){
            System.out.println("kayak yapabilirsin");
        }
        else if (sicaklik>=5 && sicaklik<25){
            if (sicaklik<=15){
                System.out.println("sinemaya gidebilirsin");
            }
            if (sicaklik>=10){
                System.out.println("pikniğe gidebilirsin");
            }

        }
        else if (sicaklik>25){
            System.out.println("yüzmeye gidebilirsin");
        }




    }

}
