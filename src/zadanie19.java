public class zadanie19 {
    public static void main(String[] args) {
        double IloscKonsumentow = 12467;
        double Tygodniowo = IloscKonsumentow * 0.14;
        double Cytrusowy = Tygodniowo*0.64;
        System.out.printf("Liczba osob kupujaca przynajmniej jeden napoj tygodniowo: %.0f",Tygodniowo);
        System.out.printf("\n Liczba osob preferujaca smak cytrusowy: %.0f",Cytrusowy);
    }
}
