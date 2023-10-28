
/*
    Należy wydrukowac tablicę zawiera co piątą sumę spośród sum koLejnych liczb całkowitych od 1 do 50.
    Wynik wykonania programu powinien mieć postac:
    liczba suma
         5  15
        10  55
        15  120
        20  210
        25  325
        30  465
        35  630
        40  820
        45  1035
        50  1275

        czyli liczymy: 1+2+3+4+5 = 15
                                   15+6+7+8+9+10 = 55
                                                   55+11+12+13+14+15 = 120 itd do 50....
 */

import javax.swing.*;

public class CoPiata {
    public static void main(String[] args) {
        new CoPiata();
    }

    public CoPiata() {

        int suma = 0;
        int licznik = 0;
        String wynik = "";                  // wyswietlac sie bedzie String a nie int !


        while (licznik < 50) {
            licznik++;                      // licznik sobie rosnie od 1 do 50
            suma += licznik;                // tymczasem suma kolejnych liczb zapisuje sie do 'suma'
            if (licznik % 5 == 0)
                wynik += licznik + "  " + suma + " " + "\n";
        }
        JOptionPane.showMessageDialog(null, wynik, "         liczba  suma", JOptionPane.INFORMATION_MESSAGE);
                                             // te spacje sa po to by tytul ramki okienka lepiej sie wyswietlal

        System.exit(0);
    }
}



















