
/*
   wyznaczanie iloczynu liczb podanych w ciągu o określonej długości
   - program ma pytac uzytkownika najpierw o to jakiej dlugosci bedzie lancuch liczb
   - nastepnie bedzie je kolejno mnozyl ze soba
 */

import javax.swing.*;

public class Iloczyn {
    public static void main(String[] args) {
        new Iloczyn();
    }

    public Iloczyn(){
        int dlugoscOdp = Integer.parseInt(JOptionPane.showInputDialog("Jakiej dlugosci bedzie ciąg liczb?"));

        int x = 1;                      // 1 !!!  bo mnozenie przez 0 sie nie uda

        for (int i = 0; i < dlugoscOdp; i++) {
            int oops = Integer.parseInt(JOptionPane.showInputDialog("Wpisz cyfrę"));
            x *= oops;
        }

        JOptionPane.showMessageDialog(null, "wynik: " + x, "Wynik iloczynu", +
                JOptionPane.INFORMATION_MESSAGE);
    }
}



















