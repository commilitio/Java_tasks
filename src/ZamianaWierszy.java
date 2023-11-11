/*
    Aplikacja do zamiany ZE SOBĄ dwoch z gory okreslonych wierszy w tablicy, np. wiersza 2 z 4

    w tym pliku wykorzystano czesc kodu 'SumaKolumna' - warto zajrzec


Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at ZamianaWierszy.main(ZamianaWierszy.java:29)

 */


import java.util.Arrays;
import java.util.Random;

public class ZamianaWierszy {
    public static void main(String[] args) {

        int wiersz = 5;
        int kolumna = 5;

        Random random = new Random();

        int [][] tablica = new int[wiersz][kolumna];

        int size = tablica[0].length;

        int [] wiersz2 = new int[size];        // tutaj zapiszemy zawartosc drugiego wiersza tablicy[][]
        int [] wiersz4 = new int[size];                        // a tu czwartego

       

        for (int i = 0; i < wiersz; i++) {
            for (int j = 0; j < kolumna; j++) {
                tablica[i][j] = random.nextInt(100);

                wiersz2[j] = tablica[1][j];         // do wiersz2[] zapisuje drugi wiersz tablica[][]
                wiersz4[j] = tablica[3][j];

                System.out.print(tablica[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println(" ");
        System.out.println("drugi wiersz: "+ Arrays.toString(wiersz2));
        System.out.println("czwarty wiersz: "+ Arrays.toString(wiersz4));
        System.out.println(" ");


        for (int i = 0; i < wiersz; i++) {
            for (int j = 0; j < kolumna; j++) {
                tablica[1][j] = wiersz4[j];
                tablica[3][j] = wiersz2[j];

                System.out.print(tablica[i][j]+ " ");
            }
            System.out.println();
        }
    }
}




















