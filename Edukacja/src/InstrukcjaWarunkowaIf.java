// Instrukcja if w języku Java służy do wykonywania bloku kodu tylko wtedy, gdy określony warunek logiczny jest spełniony (tj. ma wartość true).

public class InstrukcjaWarunkowaIf {

    public static void main(String[] args) {
        float dzielna = 4.0F;
        float dzielnik = 0;
        
        if(dzielnik!=0) {
            System.out.println("Wynik dzielenia to : " + (dzielna/dzielnik));
        } else {
            System.out.println("Proszę podaj inną liczbę");
        }
        
    }

}
