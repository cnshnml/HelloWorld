package com.example.otomasyonbes;

public class Araba {

    String marka;
    String model;
    String renk;
    int hiz;

    void calistir(){
        System.out.println(marka + "araba çalıştırıldı");
    }

    void durdur(){
        hiz =0;
        System.out.println(marka + "araba durduruldu");
    }

    void  hizlan(int artis){
        hiz += artis;
        System.out.println(marka + " arabası " + artis + " km hızlandı" );

    }
}
