import java.util.Scanner;

public class zadanie16 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        String NazwaMiasta;
        System.out.println("Podaj nazwe swojego ulubionego miasta");
        NazwaMiasta= klawiatura.nextLine();
        int IloscLiter = NazwaMiasta.length();
        String male = NazwaMiasta.toLowerCase();
        String duze = NazwaMiasta.toUpperCase();
        char ZnakMiasta =   NazwaMiasta.charAt(0);
        System.out.println("Nazwa miasta: "+NazwaMiasta+"\n Ilosc liter: "+IloscLiter
                +"\n Miasto z malej: " +male+"\n Miasto z duzej: "+duze+"\n Pierwszy znak: "+ZnakMiasta);




    }
}
