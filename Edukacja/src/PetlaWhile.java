// Pętla while w języwie Java to struktura kontrolna, która pozwala na wielokrotne wykonywanie bloku kodu tak długo, jak długo określony warunek jest spełniony (czyli ma wartość true).
//Pętla while służy do:
// Wykonywania operacji wielokrotnie, gdy nie znamy dokładnej liczby powtórzeń
// Przetwarzania danych, dopóki nie zostanie osiągnięty określony stan
// Reagowania na dane wejściowe użytkownika lub zdarzenia zewnętrzne

public class PetlaWhile {

    public static void main(String[] args) {
        int number = 0;

        while (number < 20) {
            System.out.println("Moja wartość to: " +number + " i jestem mniejsza od 20");
            number++;
        }
    }

}
