package com.example.helloworld;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        //C(n,r) = n! / (r! * (n-r)!)
        int n=5;
        int r=3;

        int faktoriyel_n=1, faktoriyel_r=1;

        for (int i=1; i<=n ; i++){
            faktoriyel_n *=i;
        }
        for (int i=1; i<=r ; i++){
            faktoriyel_r *=i;
        }

        int kombinasyon;
        kombinasyon=(faktoriyel_n)/ (faktoriyel_r * (n-r));

        System.out.println(kombinasyon);

    }
}
