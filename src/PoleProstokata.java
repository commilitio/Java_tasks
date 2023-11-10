/*
    Napisz zgodnie z zasadami programowania obiektowego program, który oblicza pole prostokąta. Klasa powinna
    zawierać trzy metody:
- czytaj_dane() — metoda umożliwia wprowadzenie doprogramu długości boków a i b z klawiatury. W programie
    należy przyjąć, że a i b oraz zmienna pole są typu double (rzeczywistego).
- przetworz_dane() — metoda oblicza pole prostokąta według wzoru pole = a*b.
- wyswietl_wynik() — metoda wyświetla długości boków a i bmoraz wartość zmiennej pole w określonym formacie.

Dla zmiennych a i b oraz pole należy przyjąć format wyświetlania ich na ekranie z dwoma miejscami po przecinku.
 */


import javax.swing.*;

public class PoleProstokata {                   // oddzielna klasa jest ponizej

    public static void main(String[] args) {

        NowaKlasaPole pole = new NowaKlasaPole();    // tworze obiekt tej oddzielnej klasy, przypisuje go do zmiennej

        pole.czytajDane();                           // wywolujemy poszczegolne metody
        pole.przetworzDane();
        pole.wyswietlWynik();
    }
}


class NowaKlasaPole{                        // oddzielna klasa w ktorej tworze metody
    double a;
    double b;
    double wynik;

    public void czytajDane(){
        this.a = Integer.parseInt(JOptionPane.showInputDialog("wpisz dlugosc pierwszego boku prostokata: "));
        this.b = Integer.parseInt(JOptionPane.showInputDialog("wpisz dlugosc drugiego boku prostokata: "));
    }

    public void przetworzDane(){
        wynik = a * b;
    }


    public void wyswietlWynik(){
        JOptionPane.showMessageDialog(null, "pole prostokata o bokach: "+ a + " oraz "
                + b + " jest rowne: " + wynik, "pole prostokata", JOptionPane.INFORMATION_MESSAGE);
    }
}



















