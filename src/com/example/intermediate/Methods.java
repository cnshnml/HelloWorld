package com.example.intermediate;

public class Methods {
    /*
    Metod vs fonk
    *farkı: metodlar classlara ait fonksiyonlardır
    ya işlemi parçalara bölmek için kullanılabilir
    ya da aynı işlemi tekrar tekrar yapmamak için kullanılabilir

    utility ya da helper class birden fazla kullanacağın metodların bulunduğu classlardır
    ReissueUtility gibi



     */

    /*
    parameter vs argument
    parametre metodu declare ettiğin yer, arguman verdigin degerler
    
     */

    public static void main(String[] args) {
        //exampleMethod2();

        int toplam = add(3,5); //argumanlar 3 ve 5
       // System.out.println(toplam);
       // System.out.println(add(4,9));

        System.out.println(usAlma(2,3));
        sum(3,7);

    } 


    static void exampleMethod (){
        System.out.println("cansu");
    }

    static void exampleMethod2(){
        exampleMethod();
    }

    static int add(int x, int y){ //parametrelerin x ve y
       // System.out.println(x+y);
        //returnden sonrası calısmaz
        return x+y;
    }

    static int usAlma(int base, int exp){
        int result = 1;
        for (int i=1 ; i <=exp ; i++){
            result *=base;
        }

        return result;
    }

    static void sum(int a, int b){
        int result=a+b;
        System.out.println(result);
    }
/*

Statik bir metot içerisinde sadece statik metotlar çağırılabilir.
Metotlar tanımlandıkları veri tipinden farklı bir değer geriye döndüremez.
Metotlar çağrılırken parametrelerin sırası önemlidir.
 */


}
