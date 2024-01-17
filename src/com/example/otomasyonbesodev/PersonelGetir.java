package com.example.otomasyonbesodev;

public class PersonelGetir {
    public static void main(String[] args) {
     Personeller personel1= new Personeller();
     Personeller personel2= new Personeller();



     personel1.ad="Cansu";
     personel1.soyad="Sahin Namli";

     personel2.ad="Naim";
     personel2.soyad="Namli";



     personel1.personelgetir();
     personel2.personelgetir();

    }

}
