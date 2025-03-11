// Instrukcja warunkowa if-else w języku Java służy do wykonywania różnych bloków kodu w zależności od spełnienia określonego warunku logicznego.

public class InstrukcjaWarunkowaElseIf {

    public static void main(String[] args) {
        
        int number = 12;

        if (number == 0) {
            System.out.println("Liczba równa zero"); 
        }else if(number > 10) {
            System.out.println("Numer większy od 10");
        }
         else if(number > 0) {
            System.out.println("Liczba dodatnia");
        } 
        else if(number < -5) {
            System.out.println("Liczba mniejsza od -5");
        } else {
            System.out.println("Zaden warunek nie został spełniony");
        }
    }
}

// kod jest wykonywany do momentu spelnienia warunku, nie probuje spelniac kolejnych warunkow