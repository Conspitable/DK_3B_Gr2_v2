import java.util.Scanner;

public class zadanie17 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj cene posilku");
        double CenaPosilku;
        CenaPosilku = klawiatura.nextDouble();
        double Podatek = 0.0675;
        double Napiwek = 0.2;
        double CenaPosilkuzP;
        CenaPosilkuzP = CenaPosilku * Podatek;
        double LacznaZaplata;
        double CenaNapiwku;
        CenaNapiwku = CenaPosilku *Napiwek;
        LacznaZaplata = CenaPosilkuzP + CenaNapiwku+ CenaPosilku;
        System.out.println("Cena dania: "+CenaPosilku+"\n Podatek: "+Podatek);
        System.out.printf("\n Napiwek: %.2f",Napiwek);
        System.out.printf("\n Laczna kwota do zaplaty: %.2f",LacznaZaplata);

    }
}
