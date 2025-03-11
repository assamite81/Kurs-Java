// Operatory logiczne w Java służą do wykonywania operacji na wartościach logicznych (true lub false). Są używane głównie w instrukcjach warunkowych (if, while, for) i operacjach na warunkach logicznych.

public class OperatoryLogiczne {

    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;

        // && -> true wtedy gdy wyrazenia skladowe sa rowne true
        System.out.println(firstValue && secondValue);  // false
        System.out.println(firstValue && fourthValue);  // true
        System.out.println(secondValue || thirdValue);  // false

        // || lub -> true gdy jedno wyrazenie jest rowne true
        System.out.println(firstValue || secondValue);  // true
        System.out.println(firstValue || fourthValue);  // true
        System.out.println(secondValue || thirdValue);  // false

        // ! negacja - zwraca wartosc przeciwna do wyrazenia przed ktorym sie znajduje
        System.out.println(!firstValue);    // false
        System.out.println(!thirdValue);    // true
        System.out.println(!(firstValue && secondValue));   // true
    }
}
