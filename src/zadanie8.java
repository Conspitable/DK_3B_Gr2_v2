import java.util.Scanner;

public class zadanie8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        double room1;
        double dlugosc1;
        double szerokosc1;
        System.out.println("Podaj dlugosc pierwszego pokoju");
        dlugosc1 =klawiatura.nextDouble();
        System.out.println("Podaj szerokosc pierwszego pokoju");
        szerokosc1 = klawiatura.nextDouble();

        double room2;
        double dlugosc2;
        double szerokosc2;
        System.out.println("Podaj dlugosc drugiego pokoju");
        dlugosc2 =klawiatura.nextDouble();
        System.out.println("Podaj szerokosc drugiego pokoju");
        szerokosc2 = klawiatura.nextDouble();

        double room3;
        double dlugosc3;
        double szerokosc3;
        System.out.println("Podaj dlugosc trzeciego pokoju");
        dlugosc3 =klawiatura.nextDouble();
        System.out.println("Podaj szerokosc drugiego pokoju");
        szerokosc3 = klawiatura.nextDouble();



        double room4;
        double dlugosc4;
        double szerokosc4;
        System.out.println("Podaj dlugosc czwartego pokoju");
        dlugosc4 =klawiatura.nextDouble();
        System.out.println("Podaj szerokosc czwartego pokoju");
        szerokosc4 = klawiatura.nextDouble();

        room1=szerokosc1*dlugosc1;
        room2=szerokosc2*dlugosc2;
        room3=szerokosc3*dlugosc3;
        room4=szerokosc4*dlugosc4;





        double dom = room1+room2+room3+room4;
        double osoby = 4;
        double naosobe = dom/osoby;
        System.out.println("Room 1: "+room1);
        System.out.println("Room 2: "+room2);
        System.out.println("Room 3: "+room3);
        System.out.println("Room 4: "+room4);
        System.out.println("dom: "+dom);
        System.out.println("Ilosc metrow na osobel: "+naosobe);
    }

}
