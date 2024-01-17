package com.example.helloworld;

import javax.activation.MimetypesFileTypeMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        int n=12;
        boolean asalMi=true;
//
//        for (int i=2; i<Math.sqrt(n) ; i++){ //i<n
//            if (n == 2) {
//                asalMi = true;
//                break;
//            }
//            if(n%i == 0){
//                asalMi=false;
//                break;
//            }
//        }
//        String str= asalMi ?"sayi asaldır":"sayı asal değildir";
//        System.out.println(str);

        List<Integer> asalSayilar = new ArrayList<>() ;


        //2den n e kadar
        for (int a= 2; a<=n ; ++a ){
            if(n==2){
                System.out.println("sayı asaldır, ikiden büyük bir sayı giriniz");
                break;
            }
            asalMi=true;

            //bulundugum sayı asal mı degil mi dongusu
            for(int b=2; b<a ; b++){
                if (a%b==0){
                    asalMi=false;
                    break;
                }

            }
            if (asalMi){
                asalSayilar.add(a);
            }
        }

        System.out.println(asalSayilar);














    }
}
