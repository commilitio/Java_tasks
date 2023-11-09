/*
    Na poczatek "for". Napisz program, który za pomocą instrukcji for dla danych wartości x zmieniających się
    od 0 do 10 oblicza wartość funkcji y = 3x.
 */

public class WhileFor {
    public static void main(String[] args) {

        System.out.println("petla for:");
        int y;
        for (int x = 0; x <= 10; x++) {
            y = 3 * x;
            System.out.print(y + " ");
        }



        /*
            Napisz program, który za pomocą instrukcji do ... while dla danych wartości x zmieniających
            się od 0 do 10 oblicza wartość funkcji y = 3x.
         */

        System.out.println("");
        System.out.println("petla do while:");

        int z = 0;
        do {
            System.out.print((z * 3) + " ");
            z++;
        }
        while (z <= 10);


        /*
            Napisz program, który za pomocą instrukcji while dla danych wartości x zmieniających się
            od 0 do 10 oblicza wartość funkcji y = 3x.
         */

        System.out.println("");
        System.out.println("petla while: ");

        int m = 0;
        while (m <= 10){
            System.out.print((m * 3) + " ");
            m++;
        }




        /*
            Napisz program wyświetlający tabliczkę mnożenia dla liczb od 1 do 100 z wykorzystaniem
            podwójnej pętli for.
         */

        System.out.println("");
        System.out.println("petla for: ");

        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= 10 ; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }




        /*
            Napisz program wyświetlający tabliczkę mnożenia dla liczb od 1 do 100 z wykorzystaniem
            podwójnej pętli do ... while.
         */

        System.out.println("");
        System.out.println("petla do while: ");

        int wiersz1 = 1;
        do {
            int kolumna1 = 1;
            do {
                System.out.print(wiersz1*kolumna1 + " ");
                kolumna1++;
            }
            while (kolumna1 <= 10);
            wiersz1++;
            System.out.println();
        }
        while (wiersz1 <= 10);



        /*
            Napisz program wyświetlający tabliczkę mnożenia dla liczb od 1 do 100 z wykorzystaniem podwójnej
            pętli while.
         */

        System.out.println();
        System.out.println("petla while");

        int wiersz2 = 1;

        while (wiersz2 <= 10){
            int kolumna2 = 1;
            while (kolumna2 <= 10){
                System.out.print(wiersz2*kolumna2 + " ");
                kolumna2++;
            }
            wiersz2++;
            System.out.println();
        }

        /*
            Napisz program, który wyświetla duże litery alfabetu od A do Z i od Z do A z wykorzystaniem
            pętli for.
         */

        System.out.println(" ");

        char znak;
        System.out.println("Program wyświetla duże litery alfabetu od A do Z i od Z do A.");

        for (znak = 'A'; znak <= 'Z'; znak++)
        {
            if (znak < 'Z')
                System.out.print(znak + ", ");
            else
                System.out.print(znak + ".");
        }
        System.out.println();
        for (znak = 'Z'; znak >= 'A'; znak--)
        {
            if (znak > 'A')
                System.out.print(znak + ", ");
            else
                System.out.print(znak + ".");
        }
    }
}















