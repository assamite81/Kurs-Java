// Typy obiektowe (referencyjne) w Java to klasy reprezentujące obiekty przechowujące dane. W przeciwieństwie do typów prostych (prymitywnych, np. int, double), typy obiektowe są instancjami klas i mogą zawierać dodatkowe metody oraz właściwości.

public class TypyObiektowe {

    public static void main(String[] args) {
        // liczby stałoprzecinkowe
        byte firstNumber = 127;         // 1 bajt -128 do 127
        short secondNumber = 32689;     // 2 bajty -32768 do 32767
        int thirdNumber = 3276899;      // 4 bajty -2 147 483 648 do 2 147 483 647
        long fourthNumber = 2148000L;   // 8 bajtów -2^63 do (2^63)-1

    // liczby zmiennoprzecinkowe
        float fifthNumber = 4,99934F;   // 4 bajty - max ok 6-7 liczb po przecinku
        double sixthNumber = 3,99999999999999D;     // 8 bajtów - max ok 15 cyfr po przecinku

    // wartość logiczna
        boolean prawda = true;
        boolean falsz = false;

    // pojedynczy znak
        char letter = 'A;'

    // ciagi znakow
        String hello = "Hello Michael";

        
    }
    
}
