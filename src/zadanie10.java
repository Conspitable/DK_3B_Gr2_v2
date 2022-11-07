import java.util.Scanner;

public class zadanie10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String PierwszeImie;
        System.out.println("Podaj pierwsze imie");
        PierwszeImie= klawiatura.nextLine();

        String DrugieImie;
        System.out.println("Podaj drugie imie");
        DrugieImie= klawiatura.nextLine();

        String Nazwisko;
        System.out.println("Podaj nazwisko");
        Nazwisko= klawiatura.nextLine();
        char Inicjal = PierwszeImie.charAt(0);
        char DrugiInicjal = DrugieImie.charAt(0);
        char Inicjalnazwiska = Nazwisko.charAt(0);

        System.out.println("Imie: " +PierwszeImie +"\nDrugie imie: "+DrugieImie+"\nNazwisko: "+Nazwisko
                +"\n Inicjal pierwszego imienia: "+Inicjal+"\n Inicjal drugiego imienia: "+DrugiInicjal+
                "\n Inicjal nazwiska: "+Inicjalnazwiska);


    }
}
