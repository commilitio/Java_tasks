/*
    wymyślone zadanie
    ćwiczę Switch Case
 */


import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {


        Scanner odp = new Scanner(System.in);               // najpierw tworze obiekt klasy Scanner

        System.out.println("wpisz teraz nazwe zwierza: ");
        String zwierz = odp.nextLine();                     // odczytuje nastepna linie

        if (zwierz.equalsIgnoreCase("leniwiecow"))     // jesli uzytkownik poda oczekiwana przeze mnie odp
            System.out.println("that shit's dingo");        // wtedy zignoruje instrukcje 'case' i wykona tą linie
        else{
            switch (zwierz){
                case "lama" :
                    System.out.println("lama to nie owca");
                    break;
                case "kojot" :
                    System.out.println("kojot to prawie owca");
                    break;
                case "owoc" :
                    System.out.println("owoc brzmi jak owca");
                    break;
                case "owca" :
                    System.out.println("brawo offca!");
                    break;
                default:
                    System.out.println(zwierz+ " to nie zwierz");
            }


            // BONUS: jak KRóTKO napisac if'a:          sprawdza sie w prostych przypadkach, przy String raczej nie
            String zwierzak = 4 * 5 == 20 ? "prawda" : "fausz";     // ? = true     : = false

        }
    }
}
















