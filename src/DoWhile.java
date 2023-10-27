import javax.swing.*;
import java.text.ParseException;

/*
    Przy pomocy instrukcji 'do while' napisz aplikację wyznaczania długości ciągu liczb zakończonego zerem.
    Zero jest traktowane jako element ciągu .
 */


public class DoWhile {
    public static void main(String[] args) {

        int licznikLiczb = 0;           // tu sie zlicza ilosc wpisanych przez uzytkownika liczb
        int liczba;                     // potrzebna zmienna do ustalenia warunku
        String odp = "";

        do {
            odp = JOptionPane.showInputDialog("wpisz liczbe: ");          // odp jest Stringiem
            liczba = Integer.parseInt(odp);                               // zmieniam String odp na int
            licznikLiczb++;                                       // zlicza ile razy uzytkownik cos wpisywal
        }
            while (liczba != 0);

        JOptionPane.showMessageDialog(null, "ciąg liczb jest rowny: " + licznikLiczb,
                "ciąg liczb", JOptionPane.WARNING_MESSAGE);

        System.exit(0);
    }
}




















