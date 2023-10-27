/*
    Wyprowadzić wszystkie cyfry danej liczby; Algorytm znajdowania wszystkich cyfr danej liczby jest następujący.

    .toCharArray()
    String.valueOf()
 */


import java.util.Arrays;

public class CyfryDanejLiczby {
    public static void main(String[] args) {

        int liczba = 764678643;                                         // liczba na ktorej pracuje


        String wynik = String.valueOf(liczba);                          // przeksztalcam ją w String
        System.out.println(Arrays.toString((wynik.toCharArray())));

                                        // lub


        char[] tablica = wynik.toCharArray();           /* .toCharArray() pobiera poszczegolne char w
                                                           danym String;  zapisuje te char do tablicy typu char[]  */

        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");        // lub System.out.println(tablica[i]);    << println
        }

        /* mozna to zadanie wykonac takze za pomoca metody .split()
                                     lub
            czytaj liczbę
            while (liczba jest różna od zera){
                wyznacz resztę z dzielenia liczby przez 10 i wydrukuj ją jako kolejną cyfrę
                przypisz liczbie wartość części całkowitej z dzielenia liczby przez 10
                }
         */
   }
}
















