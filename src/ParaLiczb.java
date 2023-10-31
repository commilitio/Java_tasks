/*
    Należy sprawdzić, czy wśród n liczb istnieje para liczb jednakowych.
 */

public class ParaLiczb {
    public static void main(String[] args) {

        int[] liczby = {8, 55, 9, 65, 43, 7, 3, 22, 68, 96, 95, 6, 43, 5, 21, 644, 875, 753, 85, 53, 85, 853, 32, 58, 42, 64, 864, 42, 5, 32, 87, 9};


        for (int i = 0; i < liczby.length; i++) {
            for (int j = i + 1; j < liczby.length; j++) {         // i+1 porownanie zaczyna sie od liczby kolejnej
                if (liczby[i] == liczby[j])
                    System.out.println(liczby[i]);              // drukuje powtarzajace sie liczby
            }
        }
        /*
            Wykonanie algorytmu przebiega zatem następująco. Najpierw jest porównywana liczba pierwsza z
            drugą, następnie pierwsza z trzecią itd. Po porównaniu pierwszej liczby z pozostałymi należy
            porównać drugą liczbę ze wszystkimi liczbami, za wyjątkiem pierwszej, ponieważ to porównanie
            już się odbyło. A więc operację porównania realizujemy dla każdej liczby, porównując ją ze
            wszystkimi liczbami, poczynając od liczby następnej.
        */
    }
}

/*              EDIT:           ALTERNATYWNE ROZWIAZANIE


        Arrays.sort(liczby);                                        sortujemy tablice

        List <Integer> pomoc = new ArrayList<>();                   tu bedziemy dodawac znalezione liczby

        for (int i = 0; i < liczby.length-1; i++) {
            if (liczby[i] == liczby[i+1])                           porownujemy po kolei kazda liczbe do nastepnej z listy
                pomoc.add(liczby[i]);
                System.out.println(liczby[i]);
        }



                EDIT:               ROZWIAZANIE Z POMOCA STRUMIENI !!


        Arrays.stream(liczby)
                .boxed()
                .filter(liczba -> Arrays.stream(liczby).filter(x -> x == liczba).count() > 1)
                .distinct()
                .forEach(x -> System.out.println(x));

      wyjasnienie do powyzszego:
        - .boxed - aby przekształcić strumień liczb całkowitych na strumień liczb całkowitych opakowanych w typ opakowujący, np. Integer
        - .distinct -  aby wyświetlić unikalne powtarzające się liczby
        - Arrays.stream(numbers) konwertuje tablicę numbers na strumień.
        - .filter(x -> x == number) służy do filtrowania elementów strumienia zgodnie z warunkiem, że x jest równy number.
        - .count() zwraca liczbę elementów spełniających warunek w strumieniu.
        - > 1 oznacza, że liczba elementów, które spełniają ten warunek, jest większa niż 1, czyli istnieje para liczb jednakowych.





 */













