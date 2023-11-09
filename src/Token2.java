/*
    Napisz program wczytujący z klawiatury dwie liczby całkowite, a następnie wyświetlający je na ekranie.
    W przypadku gdy użytkownik nie poda liczby, aplikacja ma ponawiać prośbę o jej podanie.

    (str 132 ksiazki Java - cwiczenia praktyczne / Lis M.
 */


import java.util.Scanner;
import java.util.StringTokenizer;

public class Token2 {
    public static void main(String[] args) {

        Scanner odp = new Scanner(System.in);

        System.out.println("wpisz dwie liczby calkowite");

        try {
            while (!odp.hasNextInt()){          // jesli kolejny wpis nie bedzie typu int ...
                System.out.println("wpisz LICZBY gamoniu !!");
                odp.next();                         // przejdz dalej
            }
            String liczba = odp.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(liczba, " ,;");
            while (tokenizer.hasMoreTokens())
                System.out.println(tokenizer.nextToken());
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}





















