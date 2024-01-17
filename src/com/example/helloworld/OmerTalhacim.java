package com.example.helloworld;

public class OmerTalhacim {
    public static void main(String[] args) {
       // int a=5;
       // a+=5;
//
       //
       // /*
       // Ve : a && b
       // Veya : a || b
       // Değil : !(a&&b)
       //
       //
       //
       //  */
       //

        //boolean a = false,b = false;
        //if (a&b){ // tek & yazılırsa tek tek her birini hesaplar sonuç false gelecek olsa bile,
        // && ise bir tane false olanı bulduktan sonra işleme devam etmez

        //}
        //if (a||b){

        //}
        //if (!(a&&b)){ //   !a||!b

        //}

        //Döngüler
        // do while salakcaymıs :)
        //for,while

        int omer=25;

        while (omer<=65){ //whileın içine koşul girersin, a==5, a<6 gibi bu false olana kadar döner

            if (omer==40){
                omer++;
                continue;

            }

            System.out.println("omerin yası " +omer);
            ++omer;
        }


        for (omer=25; omer<=65; omer++){
            if (omer==40){

                break;

            }

            System.out.println("omerin for yası " +omer);
        }


    }
}
