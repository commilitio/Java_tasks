/*
    Znaleźć w ciągu liczb całkowitych poprzedzonych licznikiem najdłuższą sekwencję liczb dodatnich. Powinna
    być drukowana długość sekwencji.
 */

public class CiagDodatnich {
    public static void main(String[] args) {
        new CiagDodatnich();
    }


    public CiagDodatnich(){
        int longest = 0;            // zapisuje najwyzsza uzyskana wartosc 'licznika'
        int licznik = 0;            // zapisuje ilosc kolejnych po sobie liczb dodatnich (>0)

        int [] liczby = {6, 2, -1, 13, 65, 7, -5, 76, 5, 32, 54, 85, 65, -88, 89, 54, 64};

        for (int i = 0; i < liczby.length; i++) {
            if (liczby[i] > 0)                  // pobiera wartosci kolejnych liczb z tablicy i je sprawdza >0
                licznik++;
            else if (licznik > 0) {
                if (licznik > longest) {        // jesli pobrana wartosc licznika jest obecnie najwyzsza...
                    longest = licznik;          // to przypisz ja do 'longest'
                }
                licznik = 0;                    // zeruje licznik po kazdej petli - bez tego wynik: 11
            }
        }
        System.out.println("najdluzsza sekwencja cyfr dodatnich wynosi: " + longest);
    }
}


















