/*
    W nimejszym przykładzie omówimy sposób sortowania tablicy przy pomocy algorytmu znanego w literaturze
    pod nazwą sortowania bąbelkowego. Istota tego algorytmu polega na wielokrotnym przeglądaniu par
    sąsiadującychze sobą elementów tablicy od lewej strony do prawej. Po napotkaniu pary, dla której żądana
    kolejność nie jest spełniona, elementy tej pary są przestawiane. Jeżeli sortujemy w kolejności
    od najmniejszego elementu do największego, to po zakończeniu pierwszego przeglądania największy element
    znajdzie się na końcu tablicy. Algorytm ten nazywa się bąbelkowym, ponieważ większe liczby są wynoszone
    do góry jak bąbelki w wodzie. Rozważmy działanie algorytmu na przykładzie poniższej tablicy.

    czyli porownujemy pare liczb i wieksza z liczb jest przestawiana na dalsza pozycje listy/tablicy.
    Nastepnie porownujemy kolejna pare liczby (biorac tez tą wieksza z liczb poprzedniej pary) i ją
    w ten sam sposob porownujemy itd do konca listy

 */


import java.util.Arrays;

public class SortBombelkowe {
    public static void main(String[] args) {

        int[] tablica = {5, 4, 7, 2, 3, 9, 1, 11, 10};       // bedziemy sortowac ta tablice

        int pomoc;
        boolean flagaZmiany = true;

        System.out.println("tablica przed sortowaniem: " + Arrays.toString(tablica));

        int skracamy = tablica.length;             // *patrz nizej

        while (flagaZmiany) {
            flagaZmiany = false;
            for (int i = 0; i < tablica.length - 1; i++) {
                if (tablica[i] > tablica[i + 1]) {
                    pomoc = tablica[i];
                    tablica[i] = tablica[i + 1];
                    tablica[i + 1] = pomoc;
                    flagaZmiany = true;
                }
                skracamy--;                     // nie mam pewnosci, ze to 'skracamy--' dziala
            }
        }
        System.out.println("tablica po sortowaniu: " + Arrays.toString(tablica));
    }
}
/*
cyt.
    Zauważmy, że po każdym przebiegu kolejne elementy największe przesuwają się na koniec tablicy. W związku
    z tym nie ma zatem potrzeby sprawdzania' za każdym razem tablicy do samego końca. Po każdym przebiegu
    należy zmniejszyć długość rozpatrywanej części tablicy. Zrealizujemy to poprzez wprowadzenie dodatkowej
    zmiennej 'skracamy' przyjmującej na początku wartość 'tablica', a następnie zmniejszającej swoją wartość
    o jeden po każdym sprawdzeniu zawartości tablicy.
 */



















