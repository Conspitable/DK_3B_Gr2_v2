import java.util.Scanner;

public class zadanie23 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double DlugoscRzedu;
        System.out.println("Podaj dlugosc rzedu w metrach");
        DlugoscRzedu = klawiatura.nextDouble();
        double Okratowanie;
        System.out.println("Podaj ilosc miejsca zamjowanego przez okratowanie w metrach");
        Okratowanie = klawiatura.nextDouble();
        double MiedzySadzonkami;
        System.out.println("Podaj odleglosc miedzy sadzonkami w metrach");
        MiedzySadzonkami = klawiatura.nextDouble();
        double LiczbaSadzonek = (DlugoscRzedu-2*Okratowanie)/MiedzySadzonkami;
        System.out.printf("Mozliwa ilosc sadzonek do posadzenia: %.0f",LiczbaSadzonek);

    }
}
