// Stwórz 3 obiekty klasy student. Przypisz wartości do pól. Stwórz tablice i dodaj studentów do tablicy.
// Przejdź przez elementy tablicy i wywołaj wszystkie metody

public class StudentChecker {
    public static void main(String[] args) {
        
        Student adam = new Student();
        adam.imie = "Adam";
        adam.nazwisko = "Kowalski";
        adam.numerIndeksu = 123321;
        adam.email = "adamkowalski@gmail.com";
        adam.nick = "KowalskiA";

        Student ewa = new Student();
        ewa.imie = "Ewa";
        ewa.nazwisko = "Kowalska";
        ewa.numerIndeksu = 456654;
        ewa.email = "ewakowalska@gmail.com";
        ewa.nick = "KowalskaE";

        Student arya = new Student();
        arya.imie = "Arya";
        arya.nazwisko = "Stark";
        arya.numerIndeksu = 789987;
        arya.email = "aryastark@gmail.com";
        arya.nick = "StarkA";

        Student[] students = new  Student[3];
        students[0] = adam;
        students[1] = ewa;
        students[2] = arya;

        for (int i = 0; i < students.length; i++) {
            students[i].przedstawSie();
            students[i].podajEmail();
            students[i].podajNrIndeksu();            
            students[i].zalogujSie();
        }

    }

}
