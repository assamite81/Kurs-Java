// Konstruktory w Javie to specjalne metody, które są używane do inicjalizacji obiektów. Są one kluczowym elementem programowania obiektowego w Javie. Oto podstawowe informacje o konstruktorach:
// Definicja i cechy konstruktorów:

// Konstruktor ma taką samą nazwę jak klasa, w której się znajduje
// Nie posiada typu zwracanego (nawet void)
// Jest wywoływany automatycznie podczas tworzenia nowego obiektu za pomocą operatora new
// Służy do inicjalizacji stanu obiektu (ustawienia wartości początkowych pól)

public class KonstruktoryUser {

    public String username;
    public String password;

    // public KonstruktoryUser() {

    // }
 
    public KonstruktoryUser(String username, String password) {
        System.out.println("Hello z konstruktora");
        this.username = username;
        this.password = password;


    }

    public void sayHello() {
        System.out.println("Hello, my name is " + username);
    }

}


// Ważne cechy konstruktorów:

// Jeśli nie zdefiniujesz żadnego konstruktora, Java automatycznie utworzy domyślny konstruktor bezparametrowy
// Gdy zdefiniujesz własny konstruktor, Java nie utworzy domyślnego
// Konstruktory mogą być przeciążane (overloaded) - można mieć wiele konstruktorów z różnymi parametrami
// Konstruktor może wywoływać inny konstruktor tej samej klasy przy użyciu słowa kluczowego this()
// Konstruktor może wywoływać konstruktor klasy nadrzędnej przy użyciu słowa kluczowego super()