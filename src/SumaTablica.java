/*
    Napisać program wyznaczania iloczynu oraz sumy elementów tablicy dwuwymiarowej różnych od zera.
 */

import java.util.Arrays;
import java.util.Random;

public class SumaTablica {
    public static void main(String[] args) {

        int [][] tablica = new int[3][3];

        Random random = new Random();

        int suma = 0;
        int iloczyn = 1;

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = random.nextInt(20)-10;      // wypelniam randomowo tablice
                System.out.print(tablica[i][j] + " ");
                if (tablica[i][j] != 0){
                    suma += tablica[i][j];
                    iloczyn *= tablica[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("suma dodawania: " + suma);                          // drukuje tablice
        System.out.println("iloczyn wszystkich elementow: " + iloczyn);
    }
}
















