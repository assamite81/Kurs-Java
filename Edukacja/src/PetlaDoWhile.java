// Pętla do-while w języku Java to struktura kontrolna, która wykonuje blok kodu przynajmniej raz, a następnie powtarza go, dopóki określony warunek ma wartość true.

// Główne cechy pętli do-while:
// Blok kodu zawsze wykonuje się co najmniej raz, niezależnie od wartości warunku
// Sprawdzenie warunku następuje po wykonaniu bloku kodu (w przeciwieństwie do pętli while, gdzie warunek jest sprawdzany przed wykonaniem bloku)
// Na końcu musi być średnik (;)

// Pętla do-while szczególnie przydaje się gdy:
// Chcemy, aby blok kodu został wykonany przynajmniej raz
// Potrzebujemy walidacji danych wprowadzanych przez użytkownika
// Wykonujemy operacje, które muszą być przeprowadzone przynajmniej raz przed sprawdzeniem warunku

public class PetlaDoWhile {

    public static void main(String[] args) {
        int number = 21;
        do {
            System.out.println("Moja wartość to: " +number + " i jestem mniejszy od 20");
            number++;
        }
        while (number < 20);
    }

}
