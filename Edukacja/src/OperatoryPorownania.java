// Operatory porównania w Java służą do porównywania dwóch wartości. Wynikiem takiej operacji jest wartość logiczna true lub false. Najczęściej są używane w instrukcjach warunkowych (if, while, for).
public class OperatoryPorownania {

public static void main(String[] args) {
    int firstNumber = 4;
    int secondNumber = 6;

    boolean result = firstNumber > secondNumber;

    System.out.println(result);
    System.out.println(firstNumber == secondNumber);    // Sprawdza, czy dwie wartości są sobie równe
    System.out.println(firstNumber != secondNumber);    // Sprawdza, czy dwie wartości są różne
    System.out.println(firstNumber > secondNumber);     // Sprawdza, czy pierwsza wartość jest większa od drugiej
    System.out.println(firstNumber < secondNumber);     // Sprawdza, czy pierwsza wartość jest mniejsza od drugiej
    System.out.println(firstNumber >= secondNumber);    // Sprawdza, czy pierwsza wartość jest większa lub równa drugiej
    System.out.println(firstNumber <= secondNumber);    // Sprawdza, czy pierwsza wartość jest mniejsza lub równa drugiej
    
}

}
