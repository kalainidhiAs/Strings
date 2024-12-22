package String;

import java.util.ArrayList;

public class RecurcivelyPrintAllWordsInString {
    public static ArrayList<ArrayList<String>> sentences(String[][] list) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        generateSentences(list, 0, new ArrayList<>(), result);
        return result;
    }

    private static void generateSentences(String[][] list, int index, ArrayList<String> currentSentence,
            ArrayList<ArrayList<String>> result) {
        // Base case: if we have processed all word lists
        if (index == list.length) {
            result.add(new ArrayList<>(currentSentence));
            return;
        }

        // Recursive case: iterate through the words in the current word list
        for (String word : list[index]) {
            // Add the current word to the current sentence
            currentSentence.add(word);
            // System.out.println("currentsentence: " + currentSentence);

            // Recursively call the function with the next word list
            generateSentences(list, index + 1, currentSentence, result);

            // Backtrack: remove the current word before trying the next one
            currentSentence.remove(currentSentence.size() - 1);
            // System.out.println("remove : " + currentSentence);
        }
    }

    public static void main(String[] args) {
        String[][] list = { { "you", "we" }, { "have", "are" } };
        ArrayList<ArrayList<String>> result = sentences(list);

        // Print the result
        for (ArrayList<String> sentence : result) {
            System.out.println(sentence);
        }
    }
}
