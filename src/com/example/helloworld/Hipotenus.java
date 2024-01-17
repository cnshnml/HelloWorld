package com.example.helloworld;

import java.util.Scanner;
import java.lang.Math;

public class Hipotenus {
    public static void main(String[] args) {
        int a,b,c,akare,bkare,ckare;

        Scanner input=new Scanner(System.in);
        System.out.println("ilk kenar: ");
        a= input.nextInt();

        System.out.println("ikinci kenar: ");
        b= input.nextInt();

        akare =a*a;
        bkare =b*b;
        ckare=akare+bkare;

        System.out.println(ckare);
        System.out.println(Math.sqrt(ckare));

    }
}
