public class InkrementacjaDekrementacjaRef {

    public static void main(String[] args) {
        // inkrementacja zwiekszenie wartosci o jeden

        int a = 0;
        System.out.println("Wartość a: " + a); //0
        int b = a++;
        System.out.println("Wartość b: " + b); // 0
        System.out.println("Wartość a: " + a); // 1
        int c = ++a;
        System.out.println("Wartość c: " + c); // 2
        System.out.println("Wartość a: " + a); // 2

        // dekrementacja zmniejszenie wartosci o jeden

        int d = 0;
        System.out.println("Wartość d: " + d);
        int e = d--;
        System.out.println("Wartość e: " + e);
        System.out.println("Wartość d: " + d);
        int f = --d;
        System.out.println("Wartość f: " + f);
        System.out.println("Wartość d: " + d);
    }
}
