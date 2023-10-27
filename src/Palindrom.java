/*
    Napisać program umożliwiający sprawdzenie, czy słowo zawarte w tablicy jest palindromem (palindromem
    nazywamy słowo, które czytane z lewej strony do prawej i z prawej do lewej daje ten sam ciąg liter).
 */


import javax.swing.*;

public class Palindrom {
    public static void main(String[] args) {

         String odp = JOptionPane.showInputDialog("wpisz slowo: ");



        if (sprawdzamPalindrom(odp))
            JOptionPane.showMessageDialog(null, "podane slowo jest palindromem");
        else
            JOptionPane.showMessageDialog(null, "podane slowo nie jest palindromem");

    }


    public static boolean sprawdzamPalindrom(String slowo){         // boolean! zeby powyzej ladniej wyswietlic w 'if'

        int i = 0;                                                  // pierwszy znak sprawdzanego slowa
        int j = slowo.length()-1;                                   // ostatni znak sprawdzanego slowa

        while (i < j) {                                             // dopoki ciąg znakow nie jest pusty
            if (slowo.charAt(i) != slowo.charAt(j)) {               // jesli pierwszy znak jest inny od ostatniego
                return false;
            }
            i++;                        // przesuwam sie do kolejnego znaku
            j--;                        // przesuwam sie do poprzedniego znaku
        }                        // generalnie porownuje znak 1szy z ostantnim, potem 2gi z przedostatnim itd
        return true;

    }
}



















