package zadaniaIF;

import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int IloscSekund;
        int Minuta = 0;
        int Godzina = 0;
        int  Doba = 0;
        System.out.println("Podaj ilosc sekund");
        IloscSekund = klawiatura.nextInt();

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
