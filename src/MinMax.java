import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;

/*
    Należy wyznaczyć maksimum i minimum w niepustym ciągu liczb różnych od zera, który jest zakończony zerem
    (wyznaczanie maksimum i minimum w ciągu liczb)

    Należy przeglądać kolejne liczby i porównywać z liczbą do tej pory największą, którą należy przechowywać w
    specjalnej zmiennej o nazwie na przykład 'max'

    kolejne liczby mamy wpisywac w wyskakujacym okienku

    program sie zakonczy po wpisaniu cyfry '0'
 */


public class MinMax {
    public static void main(String[] args) {
        new MinMax();

    }

    public MinMax(){                                                    // konstruktor klasy
        int max;
        int min;
        int odp;

        odp = Integer.parseInt(showInputDialog ("Podaj liczbę"));       // parse !!


        max = odp;                                          // tu beda wysylane i zapisywane obowiazujace max i min
        min = odp;

        while (odp != 0) {                  // warunek zakonczenia programu
            if (odp > max) {                // jesli wpisana przez uzytkownika liczba jest wieksza niz dotychczasowy 'max'
                max = odp;                  // zapisz ją jako obowiazujacy 'max'
            }
            else if (odp < min){
                min = odp;
            }
            odp = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbę"));
            // kontynuowanie wyswietlania okienka do wpisania liczby (dopóki != 0)
        }

        // podsumowanie obecnych max i min w postaci okienek (param na koncu to 'int messageType')
        JOptionPane.showMessageDialog(null, "max = "+ max,
                "Maksimum liczb",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null , "min = "+ min,
                "Minimum liczb",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);                                 // zakończenie pracy aplikacji
    }
}








































