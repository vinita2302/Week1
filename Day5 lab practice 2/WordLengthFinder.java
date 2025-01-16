import java.util.Scanner;

public class WordLengthFinder {

    // Method to find the length of a string without using length() method
    public static int findLength(String text) {
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to split the text into words without using split() method
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int wordCount = 0;

        // Count the number of words (words are separated by spaces)
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int wordStart = 0, wordIndex = 0;

        // Extract words using space as a delimiter
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                int wordEnd = (i == length - 1) ? i + 1 : i;
                words[wordIndex++] = text.substring(wordStart, wordEnd);
                wordStart = i + 1;
            }
        }

        return words;
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        int wordCount = words.length;
        String[][] result = new String[wordCount][2];

        for (int i = 0; i < wordCount; i++) {
            result[i][0] = words[i];                      // Store word
            result[i][1] = String.valueOf(findLength(words[i])); // Store length as String
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayWordsWithLengths(String[][] data) {
        System.out.printf("%-15s %-10s\n", "Word", "Length");
        System.out.println("----------------------------");
        for (String[] row : data) {
            System.out.printf("%-15s %-10d\n", row[0], Integer.parseInt(row[1]));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        // Call custom split method to get words
        String[] words = customSplit(input);

        // Call method to get words with their lengths
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Display the words and their lengths
        displayWordsWithLengths(wordsWithLengths);
    }
}
