package zadaniaIF;

import java.util.Scanner;

public class zadanie14 {

    public static void main(String[] args) {
            Scanner klawiatura = new Scanner(System.in);

            String pakiet;
            System.out.println("Podaj litere pakietu");
            pakiet = klawiatura.nextLine();
            double DodatkoweMinuty;
            System.out.println("Podaj ilosc dodatkowych minut");
            DodatkoweMinuty = klawiatura.nextDouble();
            double Rachunek=0;
            double Ilosc;
            double OplatazaMinuty;
            switch(pakiet){
                case "A":
                    if(DodatkoweMinuty>450){
                        Ilosc = DodatkoweMinuty - 450;
                        OplatazaMinuty = Ilosc*0.45;
                        Rachunek = 39.99+OplatazaMinuty;


                    }
                    else{
                        Rachunek = 39.99;

                    }
                case "B":
                    if(DodatkoweMinuty>900){
                        Ilosc = DodatkoweMinuty - 900  ;
                        OplatazaMinuty = Ilosc*0.40;
                        Rachunek= 59.99+OplatazaMinuty;


                    }
                    else{
                        Rachunek= 59.99;

                    }
                case "C":
                    Rachunek = 69.99;




            }
            System.out.println("Oplata za rachunek wynosi: "+Rachunek);



        }


}
