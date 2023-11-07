/*
 odwroc szyk zdania bez uzywania metody split, np. Ala ma kota -> kota ma Ala

 */


import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SzykZdania {

    public static void main(String[] args) {


        String sentence = "programowanie obiektowe jest fajne";
        System.out.println(sentence);

        List<String> newSentence = new ArrayList<>();

        StringTokenizer tokenizer = new StringTokenizer(sentence);

        while (tokenizer.hasMoreTokens()) {
            newSentence.add(tokenizer.nextToken(" "));
        }
        System.out.println(newSentence);

        for (int i = newSentence.size() - 1; i >= 0; i--) {
            System.out.print(newSentence.get(i) + " ");
        }

    }
}



















