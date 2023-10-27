/*
    Napisz program, który rekurencyjnie oblicza kolejne wartości n! dla n = 10 i wynik wyświetla na ekranie
    komputera.

    (silnia z 4! = 1*2*3*4)

    rekurencja - ang. recursion
 */


public class RekurencjaSilnia {
    public static void main(String[] args) {

        int n = 10;

        for (int i = 1; i <= n; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
    }


    public static int factorial(int number) {
        if (number > 2)                                     // we start from 2
            return number * factorial(number - 1);
        return number;                                      // if 'number' is <=2 then just return this 'number'



        /*       example without recursion:

        int factorial = 1;
        for (int i = 1; i <= number; i++) {                     // calculates factorial for every 'number' < 10 (n)
            System.out.print("silnia z " + i + " to ");
            System.out.println(factorial *= i);                  // factorial = 1*1; then 1*2; 2*3; 3*4 .....
        }
        return factorial;

         */
    }
}

















