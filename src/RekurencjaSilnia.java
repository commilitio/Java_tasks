/*
    Napisz program, który rekurencyjnie oblicza kolejne wartości n! dla n = 10 i wynik wyświetla na ekranie
    komputera.

    ps. silnia z 4! = 1*2*3*4

 */


public class RekurencjaSilnia {
    public static void main(String[] args) {

        int n = 10;

        for (int i = 1; i <= n; i++) {
            System.out.println(i + "! = " + silnia(i));
        }
    }


    public static int silnia(int liczba) {
        if (liczba > 2)                                 // zaczynamy od 2
            return liczba * silnia(liczba - 1);
        return liczba;                                  // jesli liczba jest <=2 to zwroc po prostu tą liczbe



        /*       bez rekurencji:

        int siln = 1;
        for (int i = 1; i <= liczba; i++) {              // oblicza silnie dla kazdej liczby < 10 (n)
            System.out.print("silnia z " + i + " to ");
            System.out.println(siln *= i);               // siln = 1*1; pozniej 1*2; 2*3; 3*4 .....
        }
        return siln;

         */
    }
}

















