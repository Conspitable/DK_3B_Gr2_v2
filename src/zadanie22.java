public class zadanie22 {
    public static void main(String[] args) {
        int IloscKupionychAkcji = 1000;
        double CenaZakupionychAkcji = 32.87 ;
        double Cenalaczna = IloscKupionychAkcji*CenaZakupionychAkcji;
        double ProcenBrokera = 0.02;
        double CenaKupionychzProcentem = Cenalaczna+(Cenalaczna*ProcenBrokera);
        double ProcentKupionych = CenaKupionychzProcentem - Cenalaczna;
        int IloscSprzedanychAkcji = 1000;
        double CenaSprzedanychAkcji = 33.92;
        double SprzedazAkcji = IloscSprzedanychAkcji * CenaSprzedanychAkcji;
        double CenaSprzedanychzProcentem = SprzedazAkcji+(SprzedazAkcji*ProcenBrokera);

        double SprzedazLaczna = IloscSprzedanychAkcji*CenaSprzedanychAkcji;
        double ProcentSprzedanych = CenaSprzedanychzProcentem- SprzedazLaczna;
        System.out.println("Cena kupionych akcji: "+Cenalaczna);
        System.out.printf("\n Prowizja Brokera kupionych akcji: %.2f",ProcentKupionych);
        System.out.printf("\n Cena sprzedanych akcji: "+SprzedazAkcji);
        System.out.printf("\n Prowizja Brokera sprzedanych akcji: %.2f",ProcentSprzedanych);
        double Zysk = (SprzedazAkcji-ProcentSprzedanych) - Cenalaczna-ProcentKupionych;
        System.out.printf("Zysk/Strata: %.2f",Zysk);





    }
}
