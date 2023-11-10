/*
    Rozważmy następujący problem. Należy sprawdzić, czy w tablicy istnieje dana wartość. W przykładzie
    przedstawimy dwa algorytmy rozwiązania tego problemu: pierwszy (W TYM PLIKU) dla dowolnej tablicy
    i drugi dla tablicy uporządkowanej tzn. takiej, w której elementy są podane w kolejności rosnącej
    lub malejącej. Algorytm wyszukiwania elementu dla dowolnej tablicy znany w literaturze pod nazwą
    wyszukiwania sekwencyjnego jest następujący.

    sjp sekwencja - uklad elementow w ktorym nastepuja one w okreslonej kolejnosci


    troche to bez sensu wg mnie, nie latwiej i krocej to zrobic za pomoca petli 'for' ??

 */


import javax.swing.*;

public class WyszukiwanieSekwencyjne {
    public static void main(String[] args) {


        int [] tablica = {6, 8, 44, 32, 13, 56, 17, 52, 23, 9, 42, 21, 37, 20, 11, 30, 51, 4};


        String odp = JOptionPane.showInputDialog("podaj szukana liczbe, np 11: ");
        int szukanaLiczba = Integer.parseInt(odp);

        boolean znaleziono = false;
        String wynik;

        int i = 0;                                                  // i - poczatek tablicy, miejsce 0
        do {                                                        // do
            znaleziono = (tablica[i] == szukanaLiczba);             // * patrz nizej
            i++;                                                    // przesuwamy sie w miejscach tablicy
        }
        while (!znaleziono && i < tablica.length);                  // ** patrz nizej
        wynik = "";

        if (znaleziono){
            wynik += i - 1;                                         // zapisujemy pozycje szukanaLiczba
            System.out.println("pozycja szukanej liczby: "+ wynik);
        }
        else
            System.out.println("brak takowej liczby");
    }
}

/*
        * cyt. zmiennej wynik przypisz wartość 1, gdy dany element tablicy jest równy szukanej wartości, przejdź
          do następnego elementu tablicy
          - ja to rozumiem tak, ze do zmiennej typu boolean przypisujemy zalozenie: ze jest true, gdy dany
            element tablicy[i] jest rowny 'szukanaLiczba'. Nastepnie przesuwamy sie wzdluz tablicy (i++)

        ** zmienna wynik ma wartość 1 i nie osiągnięto końca tablicy, wyprowadź informacje, czy podana liczba
           jest w tablicy
           - ja to rozumiem tak, ze dopoki zaden element tablicy nie jest rowny szukanej liczbie ORAZ
             nie znajdujemy sie jeszcze na koncu tablicy... to 'wynik' jest pusty/ brak wyniku jeszcze
 */

















