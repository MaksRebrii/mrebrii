package hw10ToLesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    private static final String text = "word1 word2 word3. Word2 word3. Word1. Word2 word3.";

    public static void main(String[] args) {
        System.out.println(countWordInText("word3", text));
    }

    private static int countWordInText(String word, String text) {
        int counter = 0;
        Matcher matcher = Pattern.compile("\\b" + word.toLowerCase() + "\\b").matcher(text.toLowerCase());
        while (matcher.find())
            counter++;
        return counter;
    }

}
