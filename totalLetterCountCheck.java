

import java.util.Scanner;

public class totalLetterCountCheck {






    /*
        Given a String ,
            if the count of the letter in the String is odd print true else print false
     */

    /*
     Bir String verildiğinde
     Eger String harf sayisi tek ise true print et değilse false print et
     */

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.print("Lutfen bir kelime giriniz : ");


            String harfSayisi = scan.nextLine();

            //  code Start here don't change before this line
            // kodu burdan başlatın ve bu satırdan önceki kodları değiştirmeyin

            if(harfSayisi.length()%2==1){

                System.out.println(true);
                System.out.println("Girilen kelimenin harf sayisi tektir");

            }else{

                System.out.println(false);
                System.out.println("Girilen kelimenin harf sayisi çifttir");

            }
        }
}
