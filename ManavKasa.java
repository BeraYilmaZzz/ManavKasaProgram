import java.util.Scanner ;
public class ManavKasa{
    public static void main(String[] args) {
        Scanner kilo = new Scanner(System.in) ;
        double Armut , Elma , Domates , Muz, Patlıcan, tutar ;
        System.out.print("Kaç kilo Armut aldınız ? : ") ;
        Armut = kilo.nextDouble();
        System.out.print("Kaç kilo Elma aldınız ? : ") ;
        Elma = kilo.nextDouble() ;
        System.out.print("Kaç kilo Domates aldınız ? : ") ;
        Domates = kilo.nextDouble() ;
        System.out.print("Kaç kilo Muz aldınız ? : ") ;
        Muz = kilo.nextDouble() ;
        System.out.print("Kaç kilo Patlıcan aldınız ? : ") ;
        Patlıcan = kilo.nextDouble() ;
        tutar = ((Armut*2.14) + (Elma*3.67) + (Domates*1.11) + (Muz*0.95) + (Patlıcan*5)) ;
        System.out.print("Toplam tutar : " + tutar) ;
    }
}