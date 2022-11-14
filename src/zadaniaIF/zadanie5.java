import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double Masa;
        System.out.println("Podaj mase obiektu w kilogramach");
        Masa = klawiatura.nextDouble();
        double Ciezar = Masa*9.8;
        System.out.println("Ciezar obiektu: "+Ciezar);
        if(Ciezar>1000){
            System.out.println("Obiekt jest za ciezki");
        }
        if(Ciezar<10){
            System.out.println("Obiekt jest za lekki");
        }

    }
}
