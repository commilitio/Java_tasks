
/*
    Za pomoca zagniezdzania petli for napisz aplikacje dajaca następujący wydruk:
*
**
***
****
*****

 */

public class Gwiazdki {
    public static void main(String[] args) {

        String x= "";

        for (int i = 1; i < 5; i++) {                   // i < 5
            for (int j = 1; j < i; j++) {               // j < i
                System.out.println(x);
                x += "*";
            }
        }
        System.out.println("\n");




/*
    ponizej bonus ciekawostka
 */

        System. out. println( "i     j     k   " + '\n');

        for (int i=1; i<=2; i++)
            for (int j=1; j<=2; j++)
                for (int k=1; k<=4; k++) {
                    if (k == 3) break;
                    System.out.println( i + "     " + j + "     " + k);

                 // System.out.println( i + "i" + "    " + j + "j" + "    " + k + "k");
                 /* powyzsze sout - wyrazniej pokazane co jest czyje
                 * dla i=1 drukujemy najpierw j1 oraz k1
                 *                      potem j1 oraz k2
                 *                      potem j2 oraz k1
                 *                      potem j2 oraz k2
                 * dla i=2 drukujemy najpierw j1 oraz k1
                 *                      potem j1 oraz k2
                 *                      potem j2 oraz k1
                 *                      potem j2 oraz k2
                 * */
                }
    }
}






















