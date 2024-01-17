package com.example.helloworld;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi= input.nextInt();
        int carpim=1;

        for (int i=1; i<=sayi ; i++){
            carpim *=i;
            //System.out.println(carpim);
        }
        System.out.println(sayi + " sayısının faktoriyeli: " +carpim);
    }
}
