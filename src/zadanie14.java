import java.util.Scanner;

public class zadanie14 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int Ocena1;
        System.out.println("Podaj ocene z pierwszego testu");
        Ocena1= klawiatura.nextInt();
        int Ocena2;
        System.out.println("Podaj ocene z drugiego testu");
        Ocena2= klawiatura.nextInt();
        int Ocena3;
        System.out.println("Podaj ocene z trzeciego testu");
        Ocena3= klawiatura.nextInt();

        double Srednia;
        int IloscOcen=3;
        Srednia=(Ocena1+Ocena2+Ocena3)/IloscOcen;
        System.out.println("Ocena z pierwszego testu: "+Ocena1+"\n Ocena z drugiego testu: "+Ocena2
                +"\n Ocena z trzeciego testu: "+Ocena3+"\n Srednia z 3 sprawdzianow: "+Srednia);

    }

}
