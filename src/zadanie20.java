import java.util.Scanner;

public class zadanie20 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double IloscCiastek;
        System.out.println("Podaj ile ciastek chcesz upiec");
        IloscCiastek = klawiatura.nextDouble();
        double IloscCukru = (1.5 /48)*IloscCiastek;
        double IloscMasla = (1 /48)*IloscCiastek;
        double IloscMaki = (2.75  /48)*IloscCiastek;
        System.out.printf("Ilosc ciastek do upieczenia: %.0f",IloscCiastek);
        System.out.printf("\n Ilosc szklanek cukru: "+IloscCukru);
        System.out.printf("\n Ilosc szklanek masla: "+IloscMasla);
        System.out.printf("\n Ilosc szklanek maki: "+IloscMaki);
    }
}
