import java.util.Scanner;

public class LongestWord {

    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        // Split the sentence into words using spaces as delimiters
        String[] words = sentence.split(" ");

        // Initialize variables to store the longest word and its length
        String longestWord = "";
        int maxLength = 0;

        // Iterate through each word
        for (String word : words) {
            
            if (word.length() > maxLength) {
                longestWord = word;       
                maxLength = word.length(); 
            }
        }

 
        return longestWord;
    }

    public static void main(String[] args) {
        // Create a scanner object 
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Call the method to find the longest word
        String longestWord = findLongestWord(sentence);

        // Display the longest word
        System.out.println("The longest word is: " + longestWord);
    }
}
