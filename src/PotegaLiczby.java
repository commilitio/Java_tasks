/*
    Sprawdzić, czy dana liczba jest potęgą innej liczby (całkowitej większej od zera).
 */


public class PotegaLiczby {
    public static void main(String[] args) {


        int a = 66;
        int b = 4356;

        if (Math.sqrt(b) == a)
            System.out.println("liczba " + a + " jest pierwiastkiem z " + b);
        else
            System.out.println("liczba " + a + " NIE jest pierwiastkiem z " + b);


        if (Math.multiplyExact(a, a) == b)
            System.out.println("liczba " + a + " jest pierwiastkiem z " + b);
        else
            System.out.println("liczba " + a + " NIE jest pierwiastkiem z " + b);
    }
}


















