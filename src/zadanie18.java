import java.util.Scanner;

public class zadanie18 {
    public static void main(String[] args) {
        double CenaAkcji;
        CenaAkcji = 600 * 21.77;
        double ProcentBrokera;
        ProcentBrokera = 0.02;
        double CenaAkcjizProcentem;
        CenaAkcjizProcentem = CenaAkcji + (CenaAkcji * ProcentBrokera);
        System.out.println("Cena akcji: "+CenaAkcji+"Procent Brokera: "+ProcentBrokera);
        System.out.printf("Laczna cena akcji: %.2f",CenaAkcjizProcentem);

    }
}
