package zadaniaIF;

import java.util.Scanner;

public class zadanie9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double waga;
        System.out.println("Podaj wage przesylki");
        waga = klawiatura.nextDouble();
        double trasa;
        System.out.println("Podaj dlugosc trasy w km");
        trasa = klawiatura.nextDouble();
        double OplataWaga=0;
        if(waga<=1){
            OplataWaga = 1.10;
        }
        if(waga>1 && waga<3){
            OplataWaga = 2.20;

        }
        if(waga>3 && waga<5){
            OplataWaga = 3.70;
        }
        if(waga>5){
            OplataWaga = 3.80;

        }
        double OplataTrasa = trasa / 500;
        if(OplataTrasa>1) OplataTrasa = OplataTrasa + 1;

        double calosc = (int)OplataWaga*OplataTrasa ;
        System.out.println("Oplata za przesylke"+calosc);




    }

}
