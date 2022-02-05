package taskThree;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        List<String> myAnimalList = new ArrayList<>(List.of("Ant", "Monkey", "cow", "Frog", "Pig", "goat", "Snake", "dog", "cat", "gOrilla", "lion", "Crocodile", "Saber-toothed predator"));

        Predicate<String> myRegex = Pattern.compile("[(aeiouy)].*[(aeiouy)]", Pattern.CASE_INSENSITIVE)
                .asPredicate();
        List<String> moreThanTwoVowels = myAnimalList.stream()
                .filter(myRegex).toList();

        System.out.println("Djur i listan som innehåller två eller fler vokaler är: " + moreThanTwoVowels);
    }
}

