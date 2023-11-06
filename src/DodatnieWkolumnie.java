/*
    Aplikacja do zliczania ilosci liczb dodatnich w określonej kolumnie (tablica 2d)

    najpierw tworze tablice ktora wypelniam losowymi liczbami

    w tym pliku wykorzystano czesc kodu 'SumaKolumna' - warto zajrzec

    random.nextInt()
 */

import java.util.Arrays;
import java.util.Random;

public class DodatnieWkolumnie {
    public static void main(String[] args) {

        int [][] tablica = new int[5][6];

        Random random = new Random();
        int dodatnie = 0;                   // bedzie zliczac liczby dodatnie w tabeli
        int [] sumaKol = new int[6];


        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = random.nextInt(200)-100;      // wypelnia tablice losowymi liczbami
                System.out.print(tablica[i][j] + " ");                      // drukuje obecny wiersz tablicy
                if (tablica[i][j] > 0){
                    sumaKol[j] += tablica[i][j];            // sumuje liczby tylko te ktore sa dodatnie
                    dodatnie++;                             // zlicza ilosc liczb dodatnich w calej tabeli
                }
            }
            System.out.println();                                           // drukuje 'enter' po pelnym wierszu
        }



        System.out.println(" ");
        System.out.println("suma dodatnich liczb w kolejnych kolumnach: " + Arrays.toString(sumaKol)+ "\n");

        System.out.print("ilosc liczb dodatnich: "+dodatnie + " na 30 liczb w calej tabeli"+ "\n");


    }
}




















