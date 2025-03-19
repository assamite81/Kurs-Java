// Klasy to podstawowe elementy programowania obiektowego, które służą jako szablony do tworzenia obiektów. Oto najważniejsze informacje o klasach w Javie:
// Klasy są fundamentalnymi strukturami języka Java, które:
// Definiują właściwości (pola) i zachowania (metody) obiektów
// Umożliwiają enkapsulację danych poprzez kontrolę dostępu (public, private, protected)
// Pozwalają na implementację dziedziczenia i polimorfizmu
// Organizują kod w logiczne jednostki

public class Auto {

    public String marka;
    public String model;
    public int rok;
    public int przebieg;

    // Dodanie konstruktora (zadanie domowe z Konstruktorów)
    public Auto() {

    }
    
    public Auto(String marka, String model, int rok, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.przebieg = przebieg;

    }
    
    public void jedz() {
        System.out.println("Jedź!");
    }

    public void hamuj() {
        System.out.println("Hamuj!");
    }

    public void info() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rok produkcji: " + rok);
        System.out.println("Przebieg: " + przebieg);
    }

}
