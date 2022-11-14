package zadaniaIF;

import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double IloscSekund;
        double Minuta;
        System.out.println("Podaj ilosc sekund");
        IloscSekund = klawiatura.nextDouble();
        if(IloscSekund>60){
            Minuta = IloscSekund/60;
            System.out.println(IloscSekund+"Tyle sekund to "+"Tyle minut: "+Minuta);
            //2

        }


    }
}
