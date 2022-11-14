package zadaniaIF;

import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double IloscSekund;
        double Minuta = 0;
        double Godzina = 0;
        double Doba = 0;
        System.out.println("Podaj ilosc sekund");
        IloscSekund = klawiatura.nextDouble();

        if(IloscSekund>60){

            Minuta = IloscSekund/60;
        }
        if(IloscSekund>3600){
            Godzina = IloscSekund/3600;
        }
        if(IloscSekund> 86400){
            Doba = IloscSekund/86400;
        }
        System.out.println("Sekund: "+IloscSekund+"\n Minut: "+Minuta +"\n Godzin: "
                +Godzina+"\n Dob: "+Doba);


    }
}
