package zadaniaIF;

import java.util.Scanner;

public class zadanie8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double IloscPakietow;
        System.out.println("Podaj ilosc zakupionych pakietow");
        IloscPakietow = klawiatura.nextDouble();

        double CenaPrzedRabatem = IloscPakietow * 99;
        double CenaPoRabcie;
        double Rabat;

        if(IloscPakietow<10){
            System.out.println("Brak rabatu");
            Rabat = 0.2;
            CenaPoRabcie = CenaPrzedRabatem - (CenaPrzedRabatem*Rabat);
        }
        if(IloscPakietow<20&&IloscPakietow>10){
            System.out.println("Rabat wynosi 20%");
            Rabat = 0.2;
            CenaPoRabcie = CenaPrzedRabatem - (CenaPrzedRabatem*Rabat);

        }
        if(IloscPakietow<50&&IloscPakietow>20){
            System.out.println("Rabat wynosi 30%");
            Rabat = 0.3;
            CenaPoRabcie = CenaPrzedRabatem - (CenaPrzedRabatem*Rabat);
        }
        if(IloscPakietow<100&& IloscPakietow>49){
            System.out.println("Rabat wynosi 40%");
            Rabat = 0.4;
            CenaPoRabcie = CenaPrzedRabatem - (CenaPrzedRabatem*Rabat);
        }
        if(IloscPakietow>=100){

            Rabat = 0.5;
            CenaPoRabcie = CenaPrzedRabatem - (CenaPrzedRabatem*Rabat);
            System.out.println("Rabat wynosi 50%"+"\n Cena po rabacie: "+ CenaPoRabcie);
        }

    }
}
