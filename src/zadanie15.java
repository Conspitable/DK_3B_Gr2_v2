import java.util.Scanner;

public class zadanie15 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double CenaDetalicznaPlytki;
        System.out.println("Podaj cene detaliczna plytki");
        CenaDetalicznaPlytki= klawiatura.nextDouble();
        double Zysk;
        Zysk = CenaDetalicznaPlytki*0.4;
        System.out.println("Cena detaliczna plyty: "+CenaDetalicznaPlytki
                +"\n Zysk z sprzedazy: "+Zysk);

    }
}
