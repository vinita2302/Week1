import java.util.Scanner;

public class ShortestLongestWord {

    // Method to find the length of a string without using the built-in length() method
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception indicates end of string
        }
        return count;
    }

    // Method to split the text into words without using the built-in split() method
    public static String[] customSplit(String str) {
        int length = findLength(str);
        int spaceCount = 0;

        // Count spaces to determine the number of words
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Number of words = number of spaces + 1
        int wordCount = spaceCount + 1;
        String[] words = new String[wordCount];
        int[] spaceIndexes = new int[spaceCount + 1];

        // Store indexes of spaces in the spaceIndexes array
        int spaceIndex = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[spaceIndex++] = i;
            }
        }
        spaceIndexes[spaceCount] = length; // Mark end of string as the last index

        // Extract words using space indexes
        int startIndex = 0;
        for (int i = 0; i < wordCount; i++) {
            int endIndex = spaceIndexes[i];
            StringBuilder word = new StringBuilder();
            for (int j = startIndex; j < endIndex; j++) {
                word.append(str.charAt(j));
            }
            words[i] = word.toString();
            startIndex = endIndex + 1;
        }

        return words;
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] getWordLengths(String[] words) {
        int numWords = findLength(words); // Number of words
        String[][] wordLengthArray = new String[numWords][2]; // 2D array to store word and its length

        for (int i = 0; i < numWords; i++) {
            wordLengthArray[i][0] = words[i];                     // Store the word
            wordLengthArray[i][1] = String.valueOf(findLength(words[i])); // Store the length as String
        }

        return wordLengthArray;
    }

    // Method to find the shortest and longest words
    public static int[] findShortestAndLongest(String[][] wordLengthArray) {
        int shortestLength = Integer.MAX_VALUE;
        int longestLength = Integer.MIN_VALUE;

        for (int i = 0; i < findLength(wordLengthArray); i++) {
            int length = Integer.parseInt(wordLengthArray[i][1]); // Convert length to integer
            if (length < shortestLength) {
                shortestLength = length;
            }
            if (length > longestLength) {
                longestLength = length;
            }
        }

        return new int[]{shortestLength, longestLength};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Splitting the text into words using the custom method
        String[] words = customSplit(input);

        // Getting the 2D array of words and their lengths
        String[][] wordLengthArray = getWordLengths(words);

        // Finding the shortest and longest words
        int[] result = findShortestAndLongest(wordLengthArray);

        // Displaying the result
        System.out.println("Shortest word length: " + result[0]);
        System.out.println("Longest word length: " + result[1]);

        scanner.close();
    }
}
