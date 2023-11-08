/*
    Napisz zgodnie z zasadami programowania obiektowego program, który w tablicy 10×10 umieszcza losowo
    na przekątnej liczby od 0 do 9, a poza przekątną zera. Dodatkowo program oblicza sumę liczb znajdujących
    się na przekątnej. Klasa powinna zawierać trzy metody z parametrami:
- czytaj_dane(double [][]macierz, int rozmiar) — metoda umieszcza dane w tablicy.
- przetworz_dane(double [][]macierz, int rozmiar) — metoda oblicza i wyświetla sumę liczb znajdujących
się na przekątnej.
- wyswietl_wynik(double [][]macierz, int rozmiar) — metoda wyświetla zawartość tablicy na ekranie monitora.

 */


import java.util.Random;

public class Tablica2dKlasa {
    public static void main(String[] args) {
        int rozmiar = 10;                               // tu inicjujemy zmienną i tablice bo tu je wywolam
        double [][] tablo = new double[rozmiar][rozmiar];       // poza tym sa niewidoczne dla metod drugiej klasy

        NowaKlasaTab2d przekatna = new NowaKlasaTab2d();          // tworze obiekt drugiej klasy
        przekatna.czytajDane2(tablo, rozmiar);
        przekatna.przetworzDane2(tablo, rozmiar);
        przekatna.wyswietlWynik2(tablo, rozmiar);
    }
}


class NowaKlasaTab2d{


    Random random = new Random();

    public void czytajDane2(double macierz[][], int rozmiar){      // bedziemy tu przesylac 'tablo' jako argument

        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[i].length; j++) {
                if (i==j){
                    macierz[i][j] = j;
                }
                else
                    macierz[i][j] = 0;
            }
        }
    }


    public void przetworzDane2(double macierz[][], int rozmiar){         // sumujemy tu przekatna i wyswietlamy
        double suma = 0;                    // tu wyswietlamy tez bo zmienna 'suma' bedzie niewidoczna dla metody 'wyswietlWynik'

        for (int i = 0; i < rozmiar; i++) {
            suma += macierz[i][i];           // [i][i] !!!   dziala tak jak for (int i = 0; i < macierz.length; i++) {
                                                       //                      for (int j = 0; j < macierz[i].length; j++) {
        }
        System.out.println("wynik sumy elemntow w przekatnej: "+ suma);
    }


    public void wyswietlWynik2(double macierz[][], int rozmiar){
        for (int i = 0; i < rozmiar; i++) {
            for (int j = 0; j < rozmiar; j++) {
            //  System.out.printf("%3.2f ", macierz[i][j]);     // zaokraglenie WSZYSTKICH liczb do 2 po przecinku
                System.out.print((int)macierz[i][j] + " ");     // zaokraglenie WSZYSTKICH liczb do calkowitych
            }
            System.out.println();
        }
    }
}



















