package zadaniaIF;

import java.util.Scanner;

public class zadanie10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double IloscKalori, IloscTluszczu;
        System.out.println("Podaj ilosc kalori w produkcie");
        IloscKalori= klawiatura.nextDouble();
        System.out.println("Podaj ilosc tluszczu w produkcie");
        IloscTluszczu = klawiatura.nextDouble();
        double KaloriezTluszczu = IloscTluszczu*9;
        double ProcentTluszczu = KaloriezTluszczu/IloscKalori*100;
        System.out.println("Prodkut zawiera"+ProcentTluszczu+"procent tluszczu");

    }
}
