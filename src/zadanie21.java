import java.util.Scanner;
import java.lang.Math;

public class zadanie21 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double PoczatkowaKwota;
        System.out.println("Podaj poczatkowa kwote znajdujaca sie na koncie");
        PoczatkowaKwota = klawiatura.nextDouble();
        System.out.println("Podaj stope");
        double Stopa;
        Stopa = klawiatura.nextDouble() /100;
        System.out.println("Podaj ilosc kapitalizacji");
        double Kapitalizacja;
        Kapitalizacja = klawiatura.nextDouble();
        System.out.println("Podaji ilosc lat");
        double  Ilosclat;
        Ilosclat = klawiatura.nextDouble();
        double KoncowaKwota;
        double Potega = (Kapitalizacja*Ilosclat);

        KoncowaKwota = PoczatkowaKwota*(1+Stopa/Kapitalizacja);
        double Potegowanie = Math.pow( KoncowaKwota ,Potega);
        System.out.printf("Kwota na koncie po uplynieciu"+Ilosclat+ "lat: "+Potegowanie);


    }
}
