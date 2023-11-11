/*
    Rozważmy następujący problem. Należy sprawdzić, czy w tablicy istnieje dana wartość. W przykładzie
    przedstawimy dwa algorytmy rozwiązania tego problemu: pierwszy dla dowolnej tablicy (inny plik)
    i drugi dla tablicy uporządkowanej (W TYM PLIKU) tzn. takiej, w której elementy są podane w kolejności rosnącej
    lub malejącej.
    Najbardziej obrazowo wyszukiwanie binarne można zilustrować na przykładzie zgadywania liczby z pewnego
    przedziału. Niech tym przedziałem będą liczby od 1 do 100, a liczba którą chcemy odgadnąć, to
    liczba 86 (oczywiście zgadujący nie wie jaka to liczba). Zgadywanie polega na każdorazowym dzieleniu
    przedziału na pół, co dwukrotnie zmniejsza wielkość przedziału , w którym znajduje się liczba. Zauważmy,
    że nawet jeżeli zakres liczb, z których mamy zgadywać, wynosi 1024, to dana liczba zostanie
    odgadnięta po co najwyżej 10 pytaniach. Wynika to z faktu , że po każdej odpowiedzi dwukrotnie zmniejszamy
    interesujący nas zakres.

    Początek rozważanego przedziału (lewa krawedz tabeli) będziemy definiować przy pomocy zmiennej 'int lewy',
    koniec przedziału (prawa krawedz) przy pomocy zmiennej 'int prawy', a środek przedziału przy pomocy zmiennej
    'int srodek'. Środek przedziału wyznaczymy następująco:
    (lewy + prawy) /2 = srodek

    (prawa krawedz) int prawy = srodek - 1;   - prawy kraniec nowego przedziału przyjmie wartość środkową -1,
                                                            natomiast lewy kraniec pozostaje bez zmian

    (lewa krawedz) int lewy = srodek + 1;     - lewy koniec nowego przedziału przyjmie wartość środkową +1,
                                                            prawy koniec tego przedziału pozostaje bez zmian

 */


import javax.swing.*;
import java.util.Arrays;

public class WyszukiwanieBinarne {
    public static void main(String[] args) {


        int [] tablica = {6, 8, 11, 13, 17, 23, 28, 33, 37, 42, 51, 66, 74, 81, 89, 93, 98};
     //            lewa krawedz                     srodek (37)                     prawa krawedz


        // najsampierw najlepiej sprawdzic czy dana tablica jest uporzadkowana (rosnaco)
        boolean uporzadkowana = true;
        for (int i = 0; i < tablica.length-1; i++) {
            if (tablica[i] > tablica[i+1]){
                uporzadkowana = false;
                break;
            }
        }
        if (uporzadkowana)
            System.out.println("tablica jest uporzadkowana");
        else
            System.out.println("tablica NIE jest uporzadkowana");



        System.out.println(" ");

        String odp = JOptionPane.showInputDialog("podaj szukana liczbe, np 76: ");
        int szukanaLiczba = Integer.parseInt(odp);


        int lewy = 0;                               // lewa krawedz poczatkowego zakresu tablicy
        int prawy = tablica.length - 1;             // prawa krawedz
        int srodek;
        boolean znaleziono = false;
        String wynik;


        do {
            srodek = (lewy+prawy) / 2;                  // srodek obecnego przedzialu liczb (zmienia sie co pętla)
            if (tablica[srodek] == szukanaLiczba){        // jesli nasza szukanaLiczba to akurat srodek przedzialu
                znaleziono = true;                      // to koniec szukania
            }
            else if (tablica[srodek] > szukanaLiczba) {     // jesli szukanaLiczba jest nizsza niz srodek przedzialu
                prawy = srodek - 1;                // zmien prawy zakres przedzialu liczb na nowy
            }
            else
                lewy = srodek+ 1;
        }
        while (!znaleziono && lewy <= prawy);       // Przedział nie jest pusty, jeżeli lewy <= prawy, co oznacza,
                                                        // że liczba nie została znaleziona
        wynik = "";
        if (znaleziono){
            wynik += srodek;                        // jesli bingo to zapisujemy liczbe/srodek w 'wynik'
            System.out.println("w tablicy znaleziono szukaną liczbę: "+ szukanaLiczba);
        }
        else{
            System.out.println("brak liczby " + szukanaLiczba + " w tablicy:");
            System.out.println(Arrays.toString(tablica));
        }

    }
}




















