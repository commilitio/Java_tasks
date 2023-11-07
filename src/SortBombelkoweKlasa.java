/*
    Napisz zgodnie z zasadami programowania obiektowego program, który sortuje n liczb (w programie jest
    ich sześć). Klasa powinna zawierać trzy metody z parametrami:
- czytaj_dane(int [] liczby, int n) — metoda czyta dane i umieszcza je w tablicy o nazwie liczby.
- przetworz_dane(int [] liczby, int n) — metoda sortuje dane według wybranego algorytmu sortowania (w programie
wykorzystano algorytm sortowania bąbelkowego).
- wyswietl_wynik(int [] liczby, int n) — metoda wyświetla zawartość posortowanej tablicy liczby na ekranie monitora
 */

import java.util.Arrays;
import java.util.Random;

public class SortBombelkoweKlasa {
    public static void main(String[] args) {

        int rozmiar = 6;
        int [] tablica = new int[rozmiar];

        NowaKlasaSort sortuj = new NowaKlasaSort();
        sortuj.czytajDane(tablica, rozmiar);
        sortuj.przetworzDane(tablica);
        sortuj.wyswietlDane(tablica);
    }
}



class NowaKlasaSort{
    public void czytajDane(int[] tablica, int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            tablica[i] = random.nextInt(50);
        }
        System.out.print(Arrays.toString(tablica));
    }

    public void przetworzDane(int [] liczby){
        int pomoc;
        boolean flaga = true;

        while (flaga){
            flaga = false;
            for (int i = 0; i < liczby.length-1; i++) {
                if (liczby[i] > liczby[i+1]){
                    flaga = true;
                    pomoc = liczby[i+1];
                    liczby[i+1] = liczby[i];
                    liczby[i] = pomoc;
                }
            }
        }
    }


    public void wyswietlDane(int [] liczby){
        System.out.println();
        System.out.println("po sortowaniu: ");
        for (int i = 0; i < liczby.length; i++) {
            System.out.print(liczby[i] + ", ");
        }
    }
}
















