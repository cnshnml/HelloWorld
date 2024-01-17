package com.example.helloworld;

import java.util.Scanner;

public class SayilariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c;

        System.out.println("birinci sayıyı giriniz");
        a=input.nextInt();

        System.out.println("ikinci sayıyı giriniz");
        b=input.nextInt();

        System.out.println("ücüncü sayıyı giriniz");
        c=input.nextInt();

        if ((a>b)&&(a>c)){
            if (b>c){
                System.out.println(" a>b>c");
            }
            if (b<c){
                System.out.println("a>c>b");
            }
        }

        else if ((b>a)&&(b>c)){
            if (a>c){
                System.out.println("b>a>c");
            }
            if (a<c){
                System.out.println("b>c>a");
            }
        }
        else {
            if (a>b){
                System.out.println("c>a>b");
            }
            else {
                System.out.println("c>b>a");
            }
        }

    }
}
