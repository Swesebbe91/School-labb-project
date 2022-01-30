package taskThree;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<String> myAnimalList = new ArrayList<>(List.of("Monke", "cow", "apage", "kamel", "goat", "Orm", "dog", "cat", "gorilla"));


        Pattern test = Pattern.compile("[aeiouy]", Pattern.CASE_INSENSITIVE);


        int count = 0;

        List<String> moreThanTwoVowels = new ArrayList<>();



        for (String word : myAnimalList
        ) {
            count = 0;
            System.out.println("ordens längd är " + word.length());
            for (int i = 0; i < word.length(); i++) {

                Matcher matches = test.matcher(word);
                matches.find();
                if (matches.find() == true)
                    count += 1;
            }
                if (count > 2) {
                    moreThanTwoVowels.add(word);
                }
        }
        System.out.println("Djur i listan med fler vokaler än 2 är: " + moreThanTwoVowels);




        long s = myAnimalList.stream()
                .map(x -> test.matcher(x))
                .map(x -> x.find())
                .filter(x -> x.equals(true))


        System.out.println(s);

    }


}

    /* Skapa en lista av ord. Använd reguljära uttryck för plocka ut endast de ord som
    innehåller 2 eller fler engelska vokaler (a, e, i, o, u, y) */

