/*
    Napisać program włączania do tablicy t, zawierającej uporządkowane liczby, dodatkowej liczby bez naruszania
    istniejącego porządku. (czyli ja dodac/wstawic jakas liczbe na swoje uporzadkowane miejsce w tablicy
    z np. rosnąco ulozonymi elementami)


    WAZNE:
    kopiujac tablice, np w ten sposob - []tab2 = []tab1 tworzymy odniesienie []tab2 dla tej samej lokalizacji
    w pamieci systemu co []tab1, czyli dokonujac zmian w []tab1 bedziemy zmieniac tez zawartosc []tab2

    natomiast kopiujac za pomoca >>> System.arraycopy() <<< tworzymy oddzielna, niezalezna kopie

    int[] source  = new int[]{1,2,3,4,5};
    int[] destination = new int[5];

    System.arraycopy( source, 0, destination, 0, source.length );           BARDZO SZYBKA METODA, polecana
    -src denotes the source array.
    -srcPos is the index from which copying starts.
    -dest denotes the destination array
    -destPos is the index from which the copied elements are placed in the destination array.
    -length is the length of the subarray to be copied.

    INNE METODY:
    1) Iterating each element of the given original array and copy one element at a time
    2) Using clone() method                         - int b[] = a.clone();
    3) Using arraycopy() method                     j.w.
    4) Using copyOf() method of Arrays class - to copy the first few elements of an array or a full copy, np
                                                int b[] = Arrays.copyOf(a, 3);
    5) Using copyOfRange() method of Arrays class - copies the specified range of the specified array into a new array
                                                int b[] = Arrays.copyOfRange(a, 2, 6);



       PROBLEM TEN mozna jeszcze rozwiazac za pomoca ArrayList - mozna przekonwertowac tablice do
       ArrayList > dodac element > przekonwertowac z powrotem na tablice > posortowac

       np.
       List lista11 = new ArrayList (Arrays.asList(tablica));
       tablica = lista11.toArray(tablica);
 */

import java.util.Arrays;

public class DodajElement {

    public static void main(String[] args) {



        // tablica do posortowania
        int[] tablica = {75, 6, 8, 44, 32, 13, 56, 17, 52, 23, 9, 42, 21, 37, 20, 11, 30, 51, 4};

        int dodaj = 18;                                                 // tą zmienna bedziemy dodawac do posortowanej tablicy

        int [] newArray = new int[tablica.length + 1];                      // nowa tablica, wieksza od poprzedniej o 1 element

        System.arraycopy(tablica, 0, newArray, 0, tablica.length);

        newArray[newArray.length - 1] = dodaj;                              // dodaje element 'dodaj' na koniec tablicy

        newArray = Arrays.stream(newArray).sorted().toArray();              // sortuje ją

        System.out.println(Arrays.toString(tablica));
        System.out.println("po sorcie:");
        System.out.println(Arrays.toString(newArray));




/*                      inne rozwiazanie, troche zagmatwane  ;)


        // tablica do posortowania
        int[] tablica = {75, 6, 8, 44, 32, 13, 56, 17, 52, 23, 9, 42, 21, 37, 20, 11, 30, 51, 4};

        int dodaj = 18;                     // tą zmienna bedziemy dodawac do posortowanej tablicy

        int pomoc;
        int j;


        for (int k = 0; k < tablica.length; k++) {              // sort przez wstawianie
            j = k;
            while (j > 0 && tablica[j - 1] > tablica[j]) {
                pomoc = tablica[j];
                tablica[j] = tablica[j - 1];
                tablica[j - 1] = pomoc;
                j--;
            }
        }
        System.out.println(Arrays.toString(tablica));

        int[] nowa = new int[tablica.length + 1];                                // nowa tablica wieksza o 1
        System.arraycopy(tablica, 0, nowa, 0, tablica.length);      // kopiuje starą do nowej


        // ponizej zliczam na ktorej pozycji OD POCZATKU bedzie nalezalo wkleic 'dodaj' (miedzy 17 a 20)
        int pomoc3 = 0;
        for (int i = 0; i < nowa.length - 1; i++) {        // .length - 1
            if (nowa[i] < dodaj)                         // jest 7 elementow mniejszych od 'dodaj'
                pomoc3++;                                // zliczam je
        }
        System.out.println("w NOWA TABLICA elementow mniejszych od DODAJ jest: " + pomoc3);


        for (int i = nowa.length - 1; i > pomoc3; i--) {      // zaczynam od konca tablicy
            nowa[i] = nowa[i - 1];                            // przesuwam je w prawo
        }

        nowa[pomoc3] = dodaj;                               // podstawiam '18' na wolne miejsce (stanowisko 7)

        System.out.println(Arrays.toString(nowa));



 */
    }
}























