/*
    algorytm sortowania przez wstawianie
    Idea tego sortowania jest analogiczna do metody układania kart stosowanej przez większosć osób grających
    w karty. Metoda ta polega na wstawianiu we właściwe miejsce do uporządkowanych do tej pory kart następnej
    karty. Przy sortowaniu elementów tablicy postępuje się w sposób analogiczny. Przypuśćmy, że należy posortować
    tablicę x w kolejności od elementu najmniejszego do największego. Zaczynamy od fragmentu tablicy, którym
    jest po prostu pierwszy element x[1] i następnie umieszczamy elementy x[2], ... ,x [n] we właściwym
    miejscu w posortowanej części tablicy.


 */


import java.util.Arrays;

public class SortowanieWstawianie {
    public static void main(String[] args) {

        int [] tablica = {7, 3, 14, 8, 32, 5, 9, 11, 13, 6};

        System.out.println("tablica przed sortowaniem: " +Arrays.toString(tablica));

        int j;
        int pomoc;                  // zmienna pomocnicza


        /*
            petla 'for': dla każdego elementu tablicy poczynając od drugiego, przesuń element tablica[i] na jego
            właściwe miejsce w posortowanej części
         */

        for (int i = 1; i < tablica.length; i++) {
            j = i;                                          // i - nr aktualnego elementu tablicy
            while (j > 0 && tablica[j-1] > tablica[j]){
                pomoc = tablica[j];
                tablica[j] = tablica[j-1];                  // zamieniamy elementy
                tablica[j-1] = pomoc;
                j--;                                        // bez tego nie dziala; ??? nie czaje czemu maleje
            }
        }
        System.out.println("tablica po sortowaniu: " +Arrays.toString(tablica));
    }
}
















