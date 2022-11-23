package zadaniaIF;

import java.util.Scanner;

public class zadanie16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double IloscKsiazek;
        double IloscPunktow=0;
        System.out.println("Podaj ilosc ksiazek kupionych w tym miesiacu ");
        IloscKsiazek = klawiatura.nextDouble();
        if (IloscKsiazek < 0) {
            IloscPunktow = 0;
        }
        if (IloscKsiazek ==1) {
            IloscPunktow = 5;
        }
        if (IloscKsiazek ==2) {
            IloscPunktow = 15;
        }
        if (IloscKsiazek ==3) {
            IloscPunktow = 30;
        }
        if (IloscKsiazek >= 4) {
            IloscPunktow = 60;
        }
        System.out.println("Ilosc zdobytych punktow: "+IloscPunktow);

    }
}
