// umozliwiaja wykonanie podstawowych operacji matematycznych

public class OperatoryMatematyczne {
    
    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber; // 10
        int substraction = firstNumber - secondNumber; // -2
        int multiplication = firstNumber * secondNumber; // 24
        float division = thirdNumber / secondNumber; // 0,66
        int modulo = firstNumber%secondNumber; // ile 4 miesci sie w 6 1, 2

        System.out.println("Dodawanie " + addition);
        System.out.println("Odejmowanie " + substraction);
        System.out.println("Mnożenie " + multiplication);
        System.out.println("Dzielenie " + division);
        System.out.println("Modulo " + modulo);

        firstNumber+=secondNumber; // firstNumber = firstNumber +secondNumber
        System.out.println("Po dodaniu: " + firstNumber); // 10
        firstNumber-=secondNumber; // firstNumber - secondNumber
        System.out.println("Po odejmowaniu: " + firstNumber); // 4
        firstNumber*=secondNumber; // firstNumber * secondNumber
        System.out.println("Po mnożeniu: " + firstNumber); // 24
        firstNumber/=secondNumber; // firstNumber / secondNumber
        System.out.println("Po dzieleniu: " + firstNumber); // 4
        firstNumber%=secondNumber; // firstNumber % secondNumber
        System.out.println("Po modulo: " + firstNumber);  // 4

        
    }

}
