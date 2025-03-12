public class PetleZadanie1 {
    // Wypisz liczby z zakresu 1-100 podzielne przez 3
    

        // x%3==0

    public static void main(String[] args) {
        for (int i = 1; i<100; i++) {
            if(i%3==0)
                System.out.println("Jestem podzielna przez 3 : " + i);
        }
    }

}
