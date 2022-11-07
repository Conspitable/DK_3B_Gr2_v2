import java.util.Scanner;

public class zadanie9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String imie;
        System.out.println("Podaj swoje imie");
        imie = klawiatura.nextLine();
        int wiek;
        System.out.println("Podaj swoj wiek");
        wiek= klawiatura.nextInt();
        double zarobki;
        System.out.println("Podaj ile chcesz zarabiac w przyszlosci");
        zarobki = klawiatura.nextDouble();

        System.out.println("Imie:" +imie +"Wiek: "+wiek +"Zarobki: "+zarobki);
    }
}
