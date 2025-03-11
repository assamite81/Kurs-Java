//* Instrukcja switch jest kolejną instrukcją warunkową, jaką mamy do dyspozycji Javie. Używamy tej instrukcji jeśli chcemy porównać zmienną warunkową ze zdefiniowanymi wartościami i na podstawie takiego porównania wykonać określony blok kodu. Instrukcja switch działa przede wszystkim ze zmiennymi typu byte, short, int, long, a także z typami enum, String oraz liczbowymi typami obiektowymi. */

public class InstrukcjaSterujacaSwitch {

    public static void main(String[] args) {
        
        String danie = "Kebab";

        switch (danie) {
            case "Pizza":
                System.out.println("Cena to 22zł");
                break;
            case "Losos":
                System.out.println("Cena to 30zł");
                break;
            case "Frytki":
                System.out.println("Cena to 9zł");
                break;
            default:
                System.out.println("Brak dania w karcie");
        }
    }

}
