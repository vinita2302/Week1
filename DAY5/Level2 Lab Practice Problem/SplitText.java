import java.util.Scanner;

public class SplitText {

    // Method to find the length of a string without using length() method
    public static int findLength(String text) {
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to split the text into words without using split()
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int wordCount = 0;

        // Count the number of words (words are separated by spaces)
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                wordCount++;
            }
        }

        // Array to store the words
        String[] words = new String[wordCount];
        int wordStart = 0, wordIndex = 0;

        // Extract words using space as a delimiter
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ' || i == length - 1) {
                // If it's the last character, include it in the word
                int wordEnd = (i == length - 1) ? i + 1 : i;
                words[wordIndex++] = text.substring(wordStart, wordEnd);
                wordStart = i + 1;
            }
        }

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        // Call the built-in split() method
        String[] builtInSplitResult = input.split(" ");

        // Call the custom split method
        String[] customSplitResult = customSplit(input);

        // Compare the two results
        boolean areEqual = compareArrays(builtInSplitResult, customSplitResult);

        // Display the results
        System.out.println("\nBuilt-in split result:");
        for (String word : builtInSplitResult) {
            System.out.print(word + " ");
        }

        System.out.println("\n\nCustom split result:");
        for (String word : customSplitResult) {
            System.out.print(word + " ");
        }

        System.out.println("\n\nAre both results equal? " + areEqual);
    }
}
