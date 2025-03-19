// Obiekty w Javie to konkretne instancje klas, które reprezentują rzeczywiste byty w programie. Stanowią one fundament programowania obiektowego w Javie.
// Oto kluczowe informacje o obiektach w Javie:
// Obiekty są tworzone na podstawie definicji klasy za pomocą operatora new
// Każdy obiekt posiada stan (wartości pól) i zachowanie (metody)
// Obiekty zajmują miejsce w pamięci i są zarządzane przez maszynę wirtualną Javy (JVM)
// Komunikują się między sobą poprzez wywoływanie metod

// Obiekty w Javie służą do:
// Modelowania elementów świata rzeczywistego w programie
// Organizacji danych i funkcjonalności w logiczne jednostki
// Hermetyzacji stanu i zachowania
// Wdrażania koncepcji programowania obiektowego jak dziedziczenie i polimorfizm
// Tworzenia skalowalnych i łatwych w utrzymaniu programów

public class AutoTest {

    public static void main(String[] args) {
        
        Auto mercedes = new Auto("Mercedes", "Klasa S", 2021, 1000);
        // mercedes.marka = "Mercedes";
        // mercedes.model = "Klasa S";
        // mercedes.rok = 2021;
        // mercedes.przebieg = 1000;

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto audi = new Auto("Audi", "A5", 2020, 0);
        // audi.marka = "Audi";
        // audi.model = "A5";
        // audi.rok = 2020;
        // audi.przebieg = 0;

        audi.jedz();
        audi.hamuj();
        audi.info();

        Auto noName = new Auto(null, null, 0, 0);

        noName.jedz();
        noName.hamuj();
        noName.info();

    }

}
