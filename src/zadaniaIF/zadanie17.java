package zadaniaIF;

import java.util.Scanner;

public class zadanie17 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        boolean wegetarianizm;
        boolean weganizm;
        boolean bezglutenu;

        System.out.println("Czy ktoras z osob jest na diecie wegetarianskiej?");
        wegetarianizm = klawiatura.nextBoolean();

        System.out.println("Czy ktoras z osob jest na diecie weganskiej");
        weganizm = klawiatura.nextBoolean();

        System.out.println("Czy ktoras z osob jest na diecie bezglutenowej");
        bezglutenu = klawiatura.nextBoolean();

        if(wegetarianizm == true && weganizm == true && bezglutenu == true){
            System.out.println("Kawiarnia na rogu \n Kuchnia u szefa");

        }
        if(wegetarianizm == true && weganizm == true && bezglutenu == false){
            System.out.println("Kuchnia u szefa");

        }
        if(wegetarianizm == true && weganizm == false && bezglutenu == true){
            System.out.println("Pizzeria przy dworcowej \n Kawiarnia na rogu \n Kuchnia u szefa");

        }
        if(wegetarianizm == false  && weganizm == true && bezglutenu == true){
            System.out.println("Kawiarnia na rogu \n Kuchnia u szefa");

        }
        if(wegetarianizm == true && weganizm == false && bezglutenu == false){
            System.out.println("Kawiarnia na rogu \n Kuchnia u szefa");

        }
        if(wegetarianizm == false && weganizm == false && bezglutenu == true){
            System.out.println("Pizzeria przy dworcowej \n Kawiarnia na rogu \n Kuchnia u szefa");

        }
        if(wegetarianizm == false && weganizm == false && bezglutenu == false){
            System.out.println("Pizzeria przy dworcowej \n Kawiarnia na rogu \n Kuchnia u szefa \n Luksusowe burgery u Jarka \n Wloskie specjaly");

        }




    }
}
