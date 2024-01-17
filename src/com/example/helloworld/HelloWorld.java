package com.example.helloworld;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int degisken = 4;

        System.out.println("degiskenin degeri: " + degisken);

        Scanner scan = new Scanner(System.in);
        System.out.println("yaş giriniz");
        int yas = scan.nextInt();

        System.out.println("yaşınız: " + yas);
        // primitiv(int, char) bunların default degeri 0dır, null olamazlar vs referans tutucular (birden fazla degeri var, adresini versen yeter, memorydeki adresi)
        /*
        string null olabilir

            operatorler
            b == a;
         */


    }
}
