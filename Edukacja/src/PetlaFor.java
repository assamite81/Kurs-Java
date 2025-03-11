// Pętla for w Java służy do wielokrotnego wykonywania określonego fragmentu kodu. Jest najczęściej używana, gdy znamy liczbę iteracji.
// zmienna sterująca to nie musi być "i", zamiast tego można użyć dowolnej wartości.

public class PetlaFor {

    public static void main(String[] args) {
        
        // for (int i = 0; i < 100; i=i+2) {
        //     System.out.println(i);
        // }

        for (int i=0; i < 100; i++) {
            if(i%5==0) {
                System.out.println(i);
            }

        
        }

    }

}
