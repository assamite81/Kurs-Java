// Metody w języku Java to bloki kodu, które wykonują określone zadania. Są one podstawowym elementem programowania obiektowego w Javie. Oto najważniejsze informacje o metodach w Javie:
// Metody służą do:
// Wykonywania określonych operacji
// Organizowania kodu poprzez grupowanie powiązanych instrukcji
// Umożliwiania wielokrotnego używania tego samego kodu
// Ukrywania szczegółów implementacji (enkapsulacja)

public class Metody {

    public void policzWynik() {
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i < 100; i ++) {
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);
    }

    public int pobierzWynik() {
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i < 100; i ++) {
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);
        return result;
    }

    public void policzWynikParam(int number) {
        System.out.println("Number ma wartość: " + number);
        System.out.println("Zaraz policzę wynik");
        int result = 0;
        for (int i = 0; i < number; i ++) {
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);
    }

    public int add(int firstNumber, int secondNumber, String word) {
        // System.out.println("Suma to: " + (firstNumber+secondNumber));
        System.out.println(word);
        return firstNumber + secondNumber;
    }

    
}

// Metody mogą:
// Przyjmować parametry (dane wejściowe)
// Zwracać wartości (lub void, jeśli nic nie zwracają)
// Wywoływać inne metody
// Być przeciążane (różne implementacje tej samej metody z różnymi parametrami)

// W Javie występują różne rodzaje metod:
// Metody instancyjne (działają na obiektach klasy)
// Metody statyczne (należą do klasy, nie do instancji)
// Metody abstrakcyjne (deklarowane w klasach abstrakcyjnych, bez implementacji)
// Konstruktory (specjalne metody do tworzenia obiektów)