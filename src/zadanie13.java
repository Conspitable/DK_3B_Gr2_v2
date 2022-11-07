import java.util.Scanner;

public class zadanie13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        int IlosczjedzonychCiastek;
        System.out.println("Podaj ilosc zjedzonych ciastek");
        IlosczjedzonychCiastek= klawiatura.nextInt();
        int IloscKalori;
        int IloscKaloriJednegoCiastka = 75;
        IloscKalori = IlosczjedzonychCiastek*IloscKaloriJednegoCiastka;
        System.out.println("Ilosc zjedzonych ciastek: "+IlosczjedzonychCiastek
                +"\n Ilosc zjedzonych kalorii: "+IloscKalori);
    }
}
