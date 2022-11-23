package zadaniaIF;

import java.util.Scanner;

public class zadanie11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String PierwszyBiegacz;
        System.out.println("Podaj nazwisko pierwszego biegacza");
        PierwszyBiegacz = klawiatura.nextLine();
        double PierwszyCzas;
        klawiatura.nextLine();
        System.out.println("Podaj czas pierwszego biegacza");
        PierwszyCzas = klawiatura.nextDouble();
        String DrugiBiegacz;
        System.out.println("Podaj nazwisko drugiego biegacza");
        DrugiBiegacz = klawiatura.nextLine();
        double DrugiCzas;
        klawiatura.nextLine();
        System.out.println("Podaj czas drugiego biegacza");
        DrugiCzas = klawiatura.nextDouble();
        String TrzeciBiegacz;
        System.out.println("Podaj nazwisko trzeciego biegacza");
        TrzeciBiegacz = klawiatura.nextLine();
        double TrzeciCzas;
        klawiatura.nextLine();
        System.out.println("Podaj czas trzeciego biegacza");
        TrzeciCzas = klawiatura.nextDouble();
        if(PierwszyCzas<DrugiCzas && PierwszyCzas<TrzeciCzas && DrugiCzas<TrzeciCzas){
            System.out.println("Pierwsze miejsce: " + PierwszyBiegacz+"Drugie miejsce"+DrugiBiegacz
                    +"Trzecie miejsce: "+TrzeciBiegacz);
        }
        if(PierwszyCzas<DrugiCzas && PierwszyCzas<TrzeciCzas && DrugiCzas>TrzeciCzas){
            System.out.println(PierwszyBiegacz+TrzeciCzas+DrugiCzas);
        }
        if(DrugiCzas<PierwszyCzas && DrugiCzas<TrzeciCzas && PierwszyCzas<TrzeciCzas){
            System.out.println(DrugiBiegacz+PierwszyBiegacz+TrzeciBiegacz);
        }
        if(DrugiCzas<PierwszyCzas && DrugiCzas<TrzeciCzas && PierwszyCzas>TrzeciCzas){
            System.out.println(DrugiBiegacz+TrzeciBiegacz+PierwszyBiegacz);
        }
        if(TrzeciCzas<PierwszyCzas && TrzeciCzas<DrugiCzas && PierwszyCzas<DrugiCzas){
            System.out.println(TrzeciBiegacz+PierwszyBiegacz+DrugiBiegacz);
        }

        if(TrzeciCzas<PierwszyCzas && TrzeciCzas<DrugiCzas && PierwszyCzas>DrugiCzas){
            System.out.println(TrzeciBiegacz+DrugiBiegacz+PierwszyBiegacz);
        }




    }
}
