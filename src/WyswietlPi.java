/*
    Napisz program, który wyświetla na ekranie komputera wartość predefiniowanej stałej π = 3,14…
    Należy przyjąć format wyświetlania tej stałej z dokładnością do pięciu miejsc po przecinku.

    Specyfikatory typów mogą być następujące:
 %d — integer,
 %e — double,
 %f — float.
 %s - String
 %c - char
Pomiędzy znakiem % i literą przyporządkowaną danemu typowi można określić ilość pól, na których ma zostać
wyświetlona liczba, np.:
%7.2f — oznacza przyznanie siedmiu pól na liczbę typu float, w tym dwóch pól na jej część ułamkową;
%4d — oznacza przyznanie czterech pól na liczbę typu całkowitego.

int x = 42;
double pi = 3.14159;
System.out.printf("The value of x is %10d, pi is %5.2f", x, pi);

 */


public class WyswietlPi {
    public static void main(String[] args) {

        double piii = Math.PI;

        System.out.printf("liczba pi taka jak chce: %2.5e ", piii);         // printf; %e
        System.out.println();
        System.out.printf("Pi = " + "%6.5f", Math.PI);                    // lepiej; %f
    }
}
















