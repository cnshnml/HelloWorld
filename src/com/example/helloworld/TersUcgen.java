package com.example.helloworld;

public class TersUcgen {
    public static void main(String[] args) {
        int n=5;

        for (int i=0; i<n ; i++){
            for (int j=5-i ; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        1- satır sayısı kadar satır basacaksın
        2- * sayım, o anda bulunduğum satırın 5'e göre tersi olacak
         */


    }
}
