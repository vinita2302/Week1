import java.util.Scanner;

public class WordReplacer {

    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // Replace occurrences of oldWord with newWord
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take sentence, old word, and new word as input
        System.out.println("Enter the sentence:");
        String sentence = scanner.nextLine();

        System.out.println("Enter the word to replace:");
        String oldWord = scanner.nextLine();

        System.out.println("Enter the new word:");
        String newWord = scanner.nextLine();

        // Call the method to replace the word
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        // Display the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence);
    }

}