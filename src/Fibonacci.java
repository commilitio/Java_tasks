/**
    cyt.:
    Liczby Fibonacci'ego są generowane w następujący sposób.
Pierwsze dwie liczby są równe O i 1, natomiast następne powstają poprzez
obliczenie sumy dwóch poprzednich. Matematycznie liczby te przedstawia
się rekurencyjnym wzorem
A1= O, A2 = 1, An+2 = An + An+1
Poniżej podano kilka liczb Fibonacciego:
O 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610

Zwróćmy uwagę na konstrukcję umożliwiającą wyznaczenie następnej liczby Fibonacciego. W tym celu
wykorzystuje się trzy zmienne:
poprzednia, biezaca i pomoc.
Jak same nazwy wskazują, w zmiennej 'poprzednia' przechowuje się poprzednią liczbę Fibonacciego, w zmiennej
'bieżąca' aktualną liczbę, a zmienna pomoc służy do generacji kolejnej liczby. Odbywa się to przy pomocy
konstrukcji:
- pomoc = poprzednia + biezaca;
- poprzednia = biezaca;
- biezaca = pomoc;

Przypuśćmy, że liczba poprzednia jest równa 8, a liczba bieżąca 13. Wartości, jakie przyjmą zmienne w wyniku
wykonania przedstawionej wyżej konstrukcji, są następujące:
pomoc   poprzednia   biezaca
21      13           21
Wyraźnie widać, że zastosowanie zmiennej pomoc jest konieczne, ponieważ bez niej uległaby zamazaniu wartość
liczby poprzedniej.

Aplikacja ponizej umożliwia wydruk w jednej linii tylu wygenerowanych liczb, ile wynosi wartość stałej
o nazwie LINIA. Powoduje to instrukcja:

if (licznik % linia == O )
    wynik += '\n';

Przejście do nowej linii następuje, gdy licznik jest wielokrotnością stałej LINIA, co oznacza, że doszliśmy
do końca linii.
 */


import javax.swing.*;



// generator liczb Fibonacci'ego

public class Fibonacci {
    public static void main(String[] args)
    {
        new Fibonacci();
    }

    public Fibonacci() {
        int poprzednia;
        int biezaca;
        int pomoc;
        int licznik;
        int n;
        String odp;
        String wynik;
        int linia = 10;

        odp = JOptionPane.showInputDialog("Ile liczb wygenerować?");
        n = Integer.parseInt(odp);

        poprzednia = 0;
        biezaca = 1;
        wynik = "";
        wynik += poprzednia + " " + biezaca + " ";
        for (licznik = 3; licznik <= n; licznik++) {
            pomoc = poprzednia + biezaca;
            poprzednia = biezaca;
            biezaca = pomoc;
            wynik += biezaca + " ";
            if (licznik % linia == 0 )
                wynik += '\n';
        }
        JOptionPane.showMessageDialog(null, wynik,
                "Liczby Fibonacciego ", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0) ;
    }
}











