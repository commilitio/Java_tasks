/*
    Wyprowadzić wszystkie cyfry danej liczby; Algorytm znajdowania wszystkich cyfr danej liczby jest następujący.

    .toCharArray()
    String.valueOf()
 */


public class CyfryDanejLiczby {
    public static void main(String[] args) {

        int liczba = 764678643;                             // liczba na ktorej pracuje

        String liczbaStr = String.valueOf(liczba);          // przeksztalcam ją w String

        char[] tablica = liczbaStr.toCharArray();           /* .toCharArray() pobiera poszczegolne char w
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
















