/*
    Napisz program wczytujący z klawiatury dwie liczby, a następnie wyświetlający je na ekranie.
    Skorzystaj z klasy StreamTokenizer.
 */


import javax.swing.*;
import java.util.StringTokenizer;

public class Token1 {
    public static void main(String[] args) {

        String odp = JOptionPane.showInputDialog("wpisz dwie liczby oddzielone od siebie spacją lub przecinkiem");

        StringTokenizer token = new StringTokenizer(odp, " ,-");

        while (token.hasMoreTokens()){
            JOptionPane.showMessageDialog(null, "twe liczby to: "+ token.nextToken());
        }
    }
}




















