
/*
    stworz apke do obliczania sumy elementów w każdej kolumnie oraz wierszu tablicy 2D


    Arrays.toString()   !!!!!!
    tablica[i][j] = x[(i*kolumna)+j];        konwertujemy tablice 1d do 2d !!!


 */


import java.util.Arrays;

public class SumaKolumna {


    public static void main(String[] args) {
        new SumaKolumna();
    }

    public SumaKolumna() {

        int[] x = {5, 8, 4, 12, 9, 22, 8,                  // ustalam tu wartosc liczb do wprowadzenia do tablicy
                   4, 17, 7, 26, 3, 12, 2,
                   5, 5, 6, 8, 13, 6, 3};

        int wiersz = 3;
        int kolumna = 7;

        int[][] tablica = new int[wiersz][kolumna];            // tabl dwuwymiarowa na 7 kolumn po 3 wiersze
        int [] sumaKol = new int[7];                // tablica na sumę kolumn; jest dlugosci najdluzszego wiersza



        for (int i = 0; i < wiersz; i++) {
            int sumaWiersza = 0;                // mozna tez int sumaWiersza = tablica[i][0];
            for (int j = 0; j < kolumna; j++) {
                tablica[i][j] = x[(i*kolumna)+j];               // przysylamy tablice 1d do 2d !!!
                System.out.print(tablica[i][j] + " ");              // print

                sumaWiersza += tablica[i][j];

                sumaKol[j] += tablica[i][j];                // liczy sume liczb w poszczegolnych kolumnach
            }
            System.out.println("suma wiersza " + sumaWiersza);
            // println; by wyswietlilo wiersz pod wierszem
        }

        System.out.println("suma poszczegolnych kolumn: " + Arrays.toString(sumaKol));


    }
}




















