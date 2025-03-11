// Tablica w języku Java to struktura danych, która przechowuje wiele elementów tego samego typu. Jest to kolekcja o stałym rozmiarze, gdzie każdy element ma przypisany indeks, rozpoczynający się od 0.

// Tablice służą do:
// Przechowywania wielu wartości tego samego typu pod jedną nazwą zmiennej
// Efektywnego zarządzania większą ilością danych
// Szybkiego dostępu do dowolnego elementu poprzez jego indeks
// Implementacji bardziej złożonych struktur danych i algorytmów

// Podstawowe cechy tablic w Javie:
// Tablica ma stały rozmiar określony podczas jej tworzenia
// Wszystkie elementy muszą być tego samego typu (np. int, String, itd.)
// Dostęp do elementów odbywa się przez indeks, np. tablica[2]
// Indeksy zaczynają się od 0, więc ostatni element ma indeks długość-1
// Tablice są obiektami w Javie

public class Tablica {
    
    public static void main(String[] args) {
        String[] imiona = new String[3];
        
        imiona[0] = "Bartek";
        imiona[1] = "Michał";
        imiona[2] = "Arya";

        // System.out.println(imiona[0]);
        // System.out.println(imiona[1]);
        // System.out.println(imiona[2]);

        int[] lottonumbers = new int[] {1, 2, 3, 4, 5, 6};
        // System.out.println(lottonumbers[0]);
        // System.out.println(lottonumbers[1]);
        // System.out.println(lottonumbers[2]);
        // System.out.println(lottonumbers[3]);
        // System.out.println(lottonumbers[4]);
        // System.out.println(lottonumbers[5]);

        // System.out.println(lottonumbers.length);

        for(int i = 0; i<imiona.length; i++) {
            System.out.println(imiona[i]);
        }
    }

}
