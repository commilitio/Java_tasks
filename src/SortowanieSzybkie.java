/*
cyt. (książka stara, więc może już nieaktualna)
    sortowanie szybkie, które charakteryzuje się najlepszym oczekiwanym czasem sortowania. Jego wadą jest
    powolność działania w przypadku szczególnym tzn. gdy tablica zawiera takie same elementy. Mimo tej wady
    jest to najlepsza ze znanych obecnie metod sortowania tablic zawierających elementy ustawione
     w sposób przypadkowy

   Algorytm sortowania szybkiego w postaci opisu słownego można sformułować następująco:
Krok 1. Wybierz dowolny element X z tablicy.
Krok 2. Podziel tablicę na dwie spójne części: część lewostronną T1 z elementami mniejszymi lub równymi X
oraz część prawostronną T2 z elementami większymi niż X.
        T1 <= X     X    T2 > X
Krok 3. Wykonuj kroki 1 i 2 dla T1 i T2, jeśli części T1 oraz T2 zawierają więcej niż jeden element

                                poniżej REKURENCYJNA METODA ALGORYTMU
 */


import java.util.Arrays;

public class SortowanieSzybkie {

    public static void main(String[] args) {
        new SortowanieSzybkie();
    }

    public SortowanieSzybkie(){

        int [] tablica = {6, 8, 44, 32, 13, 56, 17, 52, 23, 9, 42, 21, 37, 20, 11, 30, 51, 4};

        System.out.println("tablica przed uporządkowaniem :"+Arrays.toString(tablica));

        szybkieRekurencje(tablica, 0, tablica.length-1);                        // wywołujemy metodę poniżej

        System.out.println("tablica po uporządkowaniu :"+Arrays.toString(tablica));
    }


    // lewy - lewy kraniec wycinka
    // prawy - prawy kraniec wycinka
    public void szybkieRekurencje(int [] tabl, int lewy, int prawy) {              // rekurencyjna metoda sortowania
        int i;                      // zmienna przebiegajaca lewą częścią tablicy
        int j;                      // zmienna przebiegajaca prawą częścią tablicy
        int x;                      // element srodkowy
        int pomoc;                  // zmienna pomocnicza do zamiany elementow

        i = lewy;           // zmienna przesuwająca się w prawo (rosnąca) wraz ze zmieniającą się lewą krawędzią
        j = prawy;

        x = tabl[(lewy+prawy)/2];       // wyznaczenie srodkowego elementu


        while (i <= j){                 // podczas gdy zostaly elementy do przejrzenia (dopóki zmienna 'i' nie przesunie się na prawą stronę i zmienna 'j' przesunie się na lewą stronę
            while (tabl[i] < x)         // podczas gdy element lewej str tablicy jest mniejszy niz element srodkowy
                i++;                    // przesuwamy sie w prawo bo wszystko jest ok (jest on na swoim miejscu)
            while (x < tabl[j])         // podczas gdy element prawej str tablicy jest wiekszy niz element srodkowy
                j--;                    // przesuwamy sie w lewo bo wszystko jest ok (jest on na swoim miejscu)
            if (i <= j){                // podmieniamy ponizej wskazane elementy
                pomoc = tabl[i];
                tabl[i] = tabl[j];
                tabl[j] = pomoc;
                i++;                    // przesuniecie wskaznika lewej czesci tablicy w prawo
                j--;                    // przesuniecie wskaznika prawej czesci tablicy w lewo
            }
            if (lewy < j)
                szybkieRekurencje(tabl, lewy, j);           // wywolanie metody dla lewej czesci

            if (i < prawy)
                szybkieRekurencje(tabl, i, prawy);          // wywolanie metody dla prawej czesci
        }
    }
}























