/*
    napisz program ktory zapisuje do strumienia obiekty - datę, tablicę opisów i odpowiadającą każdemu
    opisowi temperaturę. Następnie odczytuje te obiekty ze strumienia i odtwarza je.

    CZYTAJJJJJJ:     https://edu.pjwstk.edu.pl/wyklady/poj/scb/Strumienie/Strumienie.html

    Rozszerzenie .ser to skrót od "serialized". W języku Java, serializacja to proces zamiany obiektu
    na strumień bajtów, który może być zapisany w pliku lub przesłany przez sieć. Obiekt może być później
    odtworzony z tego strumienia (deserializacja) i przywrócony do oryginalnej postaci obiektu.
    W plikach z rozszerzeniem .ser przechowywane są właśnie takie strumienie bajtów, które zawierają
    zserializowane obiekty.

 */


import java.io.*;
import java.util.Arrays;
import java.util.Date;



public class PlikiSerializacja {
    public static void main(String[] args) {

        Date data = new Date();
        String [] opisy = {"noc", "dzien", "woda"};
        int [] temp = {21, 29, 18};


        try {
            /* tworze strumien wyjscia ktory sluzy zapisywaniu obiektow w nim (serializacji) i lacze ze strumieniem
                ktory tworzy plik 'serializowany' */
            ObjectOutputStream wyjscie = new ObjectOutputStream(new FileOutputStream("strumien1.ser"));
            wyjscie.writeObject(data);
            wyjscie.writeObject(opisy);             // zapisuje 3 powyzsze obiekty do strumienia
            wyjscie.writeObject(temp);
            wyjscie.close();                        // pamietaj o zamknieciu strumienia !

        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // ZALOZMY ZE POWYZSZA CZESC (STRUMIEN WYCHODZACY) BYL W JEDNYM PROGRAMIE A PONIZSZY ODCZYT JEST W DRUGIM

        try {
            // tworze strumien wejscia ktory bedzie odczytywal obiekty z poprzedniego strumienia
            ObjectInputStream wejscie = new ObjectInputStream(new FileInputStream("strumien1.ser"));
            Date data2 = (Date) wejscie.readObject();
            String [] opisy2 = (String[]) wejscie.readObject();
            int [] temp2 = (int[]) wejscie.readObject();

            // teraz wyswietlimy odczytane dane ze strumienia
            System.out.println(data2);
            System.out.println(Arrays.toString(opisy2));
            System.out.println(Arrays.toString(temp2));
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}



/*
                    rozwiazanie ze str https://edu.pjwstk.edu.pl/wyklady/poj/scb/Strumienie/Strumienie.html

        Date data = new Date();
        int[] temperatura = { 25, 19 , 22};
        String[] opis = { "dzień", "noc", "woda" };

        // Zapis
        try {

            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("test.ser")
            );
            out.writeObject(data);
            out.writeObject(opis);
            out.writeObject(temperatura);
            out.close();
        } catch(IOException exc) {
            exc.printStackTrace();
            System.exit(1);
        }

        // Odtworzenie (zazwyczaj w innym programie)
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.ser"));
            Date odczytData = (Date) in.readObject();
            String[] odczytOpis = (String[]) in.readObject();
            int[] odczytTemp = (int[]) in.readObject();
            in.close();
            System.out.println(String.valueOf(odczytData));
            for (int i=0; i<odczytOpis.length; i++)
                System.out.println(odczytOpis[i] + " " + odczytTemp[i]);

        } catch(IOException exc) {
            exc.printStackTrace();
            System.exit(1);
        } catch(ClassNotFoundException exc) {
            System.out.println("Nie można odnaleźć klasy obiektu");
            System.exit(1);
        }
 */












