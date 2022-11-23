package zadaniaIF;

import java.util.Scanner;

public class zadanie15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double IloscCzekow;
        System.out.println("Podaj ilosc wystawionych czekow w tym miesiacu");
        IloscCzekow = klawiatura.nextDouble();
        double Oplata=0;
        double lacznie;
        if(IloscCzekow<20){
            Oplata = IloscCzekow*0.10;
        }
        if(IloscCzekow<=20 && IloscCzekow>=39){
            Oplata = IloscCzekow*0.08;
        }
        if(IloscCzekow<=40 && IloscCzekow>=59){
            Oplata = IloscCzekow*0.06;
        }
        if(IloscCzekow>=60){
            Oplata = IloscCzekow*0.04;
        }
        System.out.println("Oplaty pobrane w tym miesiacu przez bank: "+Oplata);


    }


        }
