/*
    Napisz zgodnie z zasadami programowania obiektowego program, który wczytuje z klawiatury imię i nazwisko,
    zapisuje te dane do pliku tekstowego dane.txt, a następnie odczytuje je z tego pliku i wyświetla na ekranie
    komputera. Klasa powinna zawierać trzy metody:
- czytaj_dane() — metoda wczytuje z klawiatury imię i nazwisko.
- zapisz_dane_do_pliku() — metoda zapisuje imię i nazwisko do pliku tekstowego o nazwie dane.txt.
- czytaj_dane_z_pliku() — metoda odczytuje dane z pliku dane.txt i wyświetla je na ekranie komputera.


    FileWriter:
- potrafi stworzyc nowy plik, ale...
- throws IOException  if the named file exists but is a directory rather than a regular file,
  does not exist but cannot be created, or cannot be opened for any other reason



    najpierw USUN PLIK dane.txt
*/


import java.io.*;
import java.util.Scanner;

public class PlikiDane {
    public static void main(String[] args) {
        TworzPlik wyniki = new TworzPlik();

        wyniki.czytajDane();
        wyniki.przetworzDane();
        wyniki.wyswietlDane();

        /*
            nie pisac powyzszego kodu jako  TworzPlik.czytajDane();             !!!!!!
                                            TworzPlik.przetworzDane();
                                            TworzPlik.wyswietlDane();           ,poniewaz:

            Oznacza to, że w każdym wywołaniu tworzysz nowy obiekt klasy TworzPlik, co prowadzi do tego, że
            pole plikDane jest zawsze równa null.
            Możesz to naprawić, tworząc tylko jeden obiekt klasy TworzPlik (jak powyzej) i wywołując na nim
            kolejno metody czytajDane(), przetworzDane() i wyswietlDane().



         */
    }
}



class TworzPlik{

    String dane;
    File plikDane;

    public void czytajDane(){
        Scanner skan = new Scanner(System.in);
        System.out.println("wpisz swe imie i nazwisko rodowe:");
        dane = skan.nextLine();
    }


    public void przetworzDane(){
        System.out.println("zapisujemy dane do pliku");
        plikDane = new File("dane.txt");
        if (!plikDane.exists()){
            try {
                plikDane.createNewFile();
            }
            catch (IOException e) {
                e.getMessage();
            }
        }
        else
            System.out.println("plik juz istnieje");

        try {
            FileWriter pisacz = new FileWriter(plikDane);     // FileWriter moze tez sam stworzyc bezposrednio plik dane.txt
            pisacz.append(dane);
            pisacz.flush();
            pisacz.close();
            System.out.println("dane zapisane do pliku");
        }
        catch (IOException e){
            e.getMessage();
        }
    }


    /*
         odczyt pliku jest realizowany przez obiekt FileReader i jego metody read(). W tym przypadku,
         każde wywołanie metody read() odczytuje jeden znak z pliku. Aby odczytać całą linię tekstu,
         konieczne jest używanie pętli while i dodawanie każdego znaku do ciągu znaków, dopóki nie
         napotkasz końca linii.
     */
    public void wyswietlDane() {
        if (plikDane.exists()){                     // trzeba za kazdym razem sprawdzac czy plik istnieje
            try {
                FileReader czytacz = new FileReader(plikDane);
                int zawartosc;                          // przechowuje wartość kodu ASCII kolejnego znaku z pliku
                while ((zawartosc = czytacz.read()) != -1){     // ** patrz nizej
                    System.out.print((char)zawartosc);          // ** patrz nizej
                }
                czytacz.close();
            }
            catch (IOException e){
                e.getMessage();
            }
        }
        else
            System.out.println("plik nie istnieje");
    }
}

/*
    **
W pętli while następuje odczyt kolejnych znaków z pliku za pomocą metody read() klasy FileReader.
W wyniku tego odczytu, zmienna 'zawartosc' przyjmuje wartość kodu ASCII kolejnego znaku z pliku lub -1,
gdy już nie ma więcej znaków do odczytu.
    **
Wewnątrz pętli while wykorzystywana jest metoda print(), która wyświetla pojedynczy znak na ekranie.
Ze względu na to, że zmienna 'zawartosc' przechowuje kod ASCII znaku, przed wyświetleniem znaku na ekranie
musi być on rzutowany na typ char. Dlatego w wywołaniu metody print() znajduje się rzutowanie: (char)zawartosc.

*/















