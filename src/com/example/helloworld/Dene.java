package com.example.helloworld;

import java.util.Scanner;

public class Dene {
    public static void main(String[] args) {
        int ay, gun;

        Scanner data = new Scanner(System.in);

        System.out.println("dogdugunuz ay");
        ay = data.nextInt();

        System.out.println("dogdugunuz gun");
        gun = data.nextInt();

        switch (ay) {
            case 1:
                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        System.out.println("oglak");
                    } else {
                        System.out.println("kova");
                    }

                } else {
                    System.out.println("gecersiz gun girdiniz");
                }

                break;
            case 2:

                if (gun >= 1 && gun <= 31) {
                    if (gun < 22) {
                        System.out.println("kova");
                    } else {
                        System.out.println("balik");
                    }

                } else {
                    System.out.println("gecersiz gun girdiniz");
                }
                break;


        }
        String burc;

        Boolean hata;

        /*baska bir yazim sekli:
        switch (ay){
            case 1:
                if (gun>=1 && gun<=31){
                    if (gun<22){
                        burc="oglak";
                    }
                    else{
                        burc="kova";
                    }

                }
                else{
                    hata= true;
                }

                break;
    }

         */
    }
}
