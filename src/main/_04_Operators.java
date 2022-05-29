package main;

public class _04_Operators {
    public static void main(String[] args) {
        //aritmetic operator : + - * / %
        int sayi1,sayi2;
        sayi1 =30;
        sayi2=6;

        System.out.println(sayi1+sayi2);
        System.out.println(sayi1-sayi2);


        //atama operatör
        //sayi1=sayi1+12;
        sayi1+=12;
        System.out.println(sayi1);

        //mantıksal(logic) operatörs
        /*
        && = ve || = veya != değil
         */


        //ilişkisel operatorlar
        /*
        >
        >=
        <
        <=
         */

        //işlem önceliği
        System.out.println(5+2*(4+6*2));
    }
}
