/*
    Napisz program zapisujący do pliku kolejne linie tekstu wczytywane z klawiatury. Program powinien
    zakończyć działanie po wprowadzeniu ciągu znaków "quit".

    DataOutputStream.writeBytes();      Writes out the string to the underlying output stream as a sequence of bytes


                CZYTAJJJJJJ:     https://edu.pjwstk.edu.pl/wyklady/poj/scb/Strumienie/Strumienie.html

 */


import java.io.*;

public class PlikiQuit {
    public static void main(String[] args) throws FileNotFoundException {

        String line = "";                   // linia odczytana z pliku
        FileOutputStream pisz = null;

        try{
            pisz = new FileOutputStream("plikQuit.txt");            // tworzymy obiekt i plik
        }
        catch(FileNotFoundException e){
            System.out.println("Błąd przy otwieraniu pliku.");
            System.exit(-1);
        }

        DataOutputStream wyjscie = new DataOutputStream(pisz);      // służy do zapisywania danych typu "primitive" do strumienia wyjściowego (w tym przypadku do pliku).
        BufferedReader czytam = new BufferedReader(new InputStreamReader(System.in));   // czyta dane z klawiatury

        try{
            while (true){
                if((line = czytam.readLine()) == null || line.equals("quit")){
                    break;
                }
                wyjscie.writeBytes(line + '\n');        // zapisuje dane do pliku;   \n znak konca wiersza
            }
        }
        catch(IOException e){
            System.out.println("Read/Write error.");
        }
    }
}


/*
    ewent.

    do {
        line = czytam.readline();
        System.out.println(line);
        }
    while (!line.equals("stop");

 */



















