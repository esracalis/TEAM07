package ODEVLER;

import java.util.Scanner;

public class TekMiCiftMiMethod {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("tamsayi giriniz");

        int sayi=scan.nextInt();

        tekcift(sayi);// method olusturuldu

        System.out.println(tekcift(sayi));
    }

    private static boolean tekcift(int sayi) {
        boolean snc=true;

        if ((sayi%2==0)){

            snc=true;

        } else snc=false;

        return snc;
    }
}
