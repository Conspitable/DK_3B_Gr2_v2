import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double IloscLitrow;
        System.out.println("Podaj ilosc zuzytych litrow paliwa");
        IloscLitrow= klawiatura.nextDouble();
        double IloscKilometrow;
        System.out.println("Podaj ilosc przejechanych kilometrow");
        IloscKilometrow = klawiatura.nextDouble();
        double ZuzyciePaliwa;
        ZuzyciePaliwa = IloscKilometrow / IloscLitrow;
        System.out.println("Liczba kilometrow przejechanych na litrze paliwa: "+ZuzyciePaliwa);

    }
}
