package zadaniaIF;

import java.util.Scanner;

public class zadanie12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int Powierzchnia;
        System.out.println("Wybierz w czym ma sie rozchodzic dzwiek 1.Woda 2.Stal 3.Powietrze");
        Powierzchnia = klawiatura.nextInt();
        double Odleglosc;
        System.out.println("Podaj odlegosc rozchodzenia sie dzwieku");
        Odleglosc = klawiatura.nextDouble();
        double czas=0;
        switch (Powierzchnia){
            case 1:
                czas = Odleglosc/1490;

            case 2:
                czas = Odleglosc/5100;

            case 3:
                czas = Odleglosc/343;

        }
        System.out.println("Czas potrzebny na pokonianie podanej odleglosci przez dzwiek: " + czas+"s.");

    }
}
