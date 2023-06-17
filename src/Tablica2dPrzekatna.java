/*
    Napisz program, który w zadeklarowanej tablicy dwuwymiarowej 10×10 o nazwie macierz umieszcza
    na przekątnej liczbę 1, a poza przekątną 0. Dodatkowo program powinien obliczać sumę elementów wyróżnionych
    w tablicy, tj. tych znajdujących się na jej przekątnej.
 */

public class Tablica2dPrzekatna {
    public static void main(String[] args) {

        int [][] tablo = new int[10][10];


        int sumaPrzekatnej = 0;

        for (int i = 0; i <= 9; i++) {
            int sumaWiersz = 0;
            for (int j = 0; j <= 9; j++) {
                tablo[i][j] = 0;                            // wypelniam tablice zerami
                if (i == j){                                // przekatna
                    tablo[i][j] = 1;
                    sumaPrzekatnej += tablo[i][j];          // sumujemy ją
                }
                System.out.print(tablo[i][j] + " ");
                sumaWiersz += tablo[i][j];                  // sumuje dany wiersz
            }
            System.out.println("suma wiersza: " + sumaWiersz);
        }
        System.out.println("suma w przekatnej: " + sumaPrzekatnej);


        /*
            Napisz program, który w zadeklarowanej tablicy dwuwymiarowej 10×10 o nazwie macierz umieszcza
            na przekątnej liczby od 0 do 9, a poza przekątną liczbę 0. Dodatkowo program powinien obliczać
            sumę elementów wyróżnionych w tablicy (znajdujących się na przekątnej).
         */

        System.out.println(" ");

        int [][] tablo2 = new int[10][10];
        int przekatna = 0;
        int licznik = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablo2[i][j] = 0;
                if (i == j){
                    tablo2[i][j] = licznik;
                    przekatna += licznik;
                    licznik++;
                }
                System.out.print(tablo2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("suma przekatnej: " + przekatna);



        /*
            Napisz program, który w zadeklarowanej tablicy dwuwymiarowej 10×10 o nazwie macierz umieszcza
            liczby 1 i 0 zgodnie z zamieszczoną poniżej interpretacją graficzną. Program dodatkowo powinien
            obliczać sumę wyróżnionych elementów.
            (grafika przedstawia tablice 10x10 wygladajaca jak te powyzej, z tą roznicą ze jedynki po przekątnej
            ida od prawego gornego rogu do lewego dolnego.
         */

        System.out.println(" ");

        int [][] tablo3 = new int[10][10];

        int sumaPrzekatna2 = 0;

        for (int i = 9; i >= 0; i--) {              // wiersz zaczyna od konca
            for (int j = 0; j <= 9; j++) {
                tablo3[i][j] = 0;
                if (i==j){
                    tablo3[i][j] = 1;
                    sumaPrzekatna2 += tablo3[i][j];
                }
                System.out.print(tablo3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("suma przekatnej: " + sumaPrzekatna2);



        /*
            Napisz program, który w zadeklarowanej tablicy dwuwymiarowej 10×10 umieszcza w pierwszej kolumnie
            liczby od 0 do 9, w drugiej kwadraty tych liczb, natomiast w pozostałych kolumnach 0.
            Dodatkowo program powinien obliczać osobno sumę liczb znajdujących się w pierwszej oraz w drugiej kolumnie.
         */

        System.out.println(" ");

        int sumaKol1 = 0;
        int sumaKol2 = 0;
        int licznik2 = 0;

        int[][] tablo4 = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablo4[i][j] = 0;
                if (j == 0){
                    tablo4[i][j] = licznik2;
                    sumaKol1 += licznik2;           // sumujemy kolumne 1
                    licznik2++;
                }
                else if (j == 1) {
                    tablo4[i][j] = (int) Math.pow(licznik2-1, 2);   // kwadrat licznika (-1 bo w linii 107 jest licznik++ wiec nie tą linie bysmy liczyli)
                    sumaKol2 += tablo4[i][j];       // sumujemy kolumne 2
                }
                System.out.print(tablo4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("suma kolumny 1: " + sumaKol1);
        System.out.println("suma kolumny 2: " + sumaKol2);


        /*
            Dane są dwie tablice dwuwymiarowe 10×10 o nazwach a i b. Tablica a zawiera elementy przedstawione
            poniżej.
            0 1 2 3 4 5 6 7 8 9
            0 1 2 3 4 5 6 7 8 9
            0 1 2 3 4 5 6 7 8 9
            0 1 2 3 4 5 6 7 8 9
            0 1 2 3 4 5 6 7 8 9
            0 1 2 3 4 5 6 7 8 9
            0 1 2 3 4 5 6 7 8 9
            0 1 2 3 4 5 6 7 8 9
            0 1 2 3 4 5 6 7 8 9
            0 1 2 3 4 5 6 7 8 9
            Tablica b zawiera same zera. Napisz program, który przepisuje zawartość tablicy a do tablicy b
            (interpretacja graficzna tablicy wynikowej poniżej), zamieniając kolumny na wiersze.
            0 0 0 0 0 0 0 0 0 0
            1 1 1 1 1 1 1 1 1 1
            2 2 2 2 2 2 2 2 2 2
            3 3 3 3 3 3 3 3 3 3
            4 4 4 4 4 4 4 4 4 4
            5 5 5 5 5 5 5 5 5 5
            6 6 6 6 6 6 6 6 6 6
            7 7 7 7 7 7 7 7 7 7
            8 8 8 8 8 8 8 8 8 8
            9 9 9 9 9 9 9 9 9 9
         */
        System.out.println(" ");


        int [][] a = new int[10][10];
        int [][] b = new int[10][10];

        int licznik3 = 0;

        System.out.println("tabela a:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = j;                            // wypelniamy tablice wartoscią rownej danej kolumnie
                                                        // gdyby bylo = i to wypelnilibysmy wartoscia wiersza
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("tablica b:");

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = a[j][i];                      // kopia a do b; zmiana kolumn na wiersze [i][j] > [j][i]
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}




















