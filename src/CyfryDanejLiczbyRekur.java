/*
    Spróbujemy teraz napisać wersję rekurencyjną algorytmu wyznaczania cyfr podanej liczby.

 */

import javax.swing.*;

public class CyfryDanejLiczbyRekur {
    public static void main(String[] args) {
        new CyfryDanejLiczbyRekur();
    }


    private String wynik;                               // tutaj wynik, w klasie glownej


    public CyfryDanejLiczbyRekur() {

        int odp = Integer.parseInt(JOptionPane.showInputDialog("wpisz ponizej liczbe: "));

        wynik = "";                                     // tutaj wynik, w konstruktorze klasy

        Cyfry(odp);             // wywoluje metode w konstruktorze klasy

        JOptionPane.showMessageDialog(null, wynik, "Cyfry", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }



    private void Cyfry(int liczba){
        int odp;
        if ((odp = liczba / 10) != 0){          // jesli nie zostalo zero po dzieleniu przez 10 to ... (powstaje nowa liczba, mniejsza o koncowke)
            Cyfry(odp);                         // rekurencja; czyli dzielimy tą liczbe dalej przez 10 (a koncowke z dzielenia zapisujemy ponizej)
        }
        wynik += liczba % 10 + " ";             // tutaj wynik, w metodzie; zapisz koncowke z dzielenia przez 10

    }
}




















