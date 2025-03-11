
import java.util.Scanner;

// Zapytaj uzytkownika o wiek.
// W przypadku, gdy ma mniej niz 18 lat wypisz na ekranie informacje, ze musi sie wykazac kreatywnoscia, zeby sie dzis napic alkoholu
// Gdy ma wiecej niz 18 lat podziekuj za zakupy

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A ile Ty masz lat dziecko?");
        int age = scanner.nextInt();        
        if(age < 18 && age >= 0) {
            System.out.println("Przyslij Pana Henia z ławki po drugiej stronie ulicy, ogarnie za Harnasia");            
        } else if (age < 0) {
            System.out.println("Jeszcze się nie urodziłeś?");            
        } else {
            System.out.println("Co podać?");
        }
    }

}
