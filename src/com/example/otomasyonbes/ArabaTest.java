package com.example.otomasyonbes;

public class ArabaTest {
    public static void main(String[] args) {
        Araba araba1 = new Araba();
        Araba araba2 = new Araba();


        araba1.marka = "Toyota";
        araba1.model = "Corolla";
        araba1.renk = "Beyaz";
        araba2.marka = "Honda";
        araba2.model = "Civic";
        araba2.renk = "Mavi";

        araba1.calistir();
        araba1.hizlan(50);
        araba1.hizlan(11);

    }
}
