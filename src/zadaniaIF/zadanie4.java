package zadaniaIF;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double Pierwszytest;
        System.out.println("Podaj wynik pierwszego testu w procentach");
        Pierwszytest = klawiatura.nextDouble();
        double Drugitest;
        System.out.println("Podaj wynik drugiego testu w procentach");
        Drugitest = klawiatura.nextDouble();
        double Trzecitest;
        System.out.println("Podaj wynik trzeciego testu w procentach");
        Trzecitest = klawiatura.nextDouble();
        double Srednia = (Pierwszytest+Drugitest+Trzecitest)/3;
            System.out.println("Srednia trzech testow: "+Srednia);
            if(Srednia>90){
                System.out.println("\n Ocena: 5 ");
            }
            if(Srednia<90&&Srednia>81){
                System.out.println("\n Ocena: 4");
            }
            if(Srednia<80&&Srednia>71){
                System.out.println("\n Ocena: 3");
            }
            if(Srednia<70&&Srednia>61){
                System.out.println("\n Ocena: 2");
            }
            if(Srednia<60){
                System.out.println("\n Ocena: 1");
            }



    }
}
