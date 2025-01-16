import java.util.Scanner;

public class MostFrequentCharacter {

    public static char findMostFrequentChar(String text) {
        int[] frequency = new int[256]; // Array to store frequency of each character (ASCII values)
        int maxFrequency = 0;
        char mostFrequentChar = ' ';

        // Count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;

            // Update most frequent character if current character has higher frequency
            if (frequency[ch] > maxFrequency) {
                maxFrequency = frequency[ch];
                mostFrequentChar = ch;
            }
        }

        return mostFrequentChar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input string from the user
        System.out.println("Enter the string:");
        String text = scanner.nextLine();

        // Call the method and display the result
        char result = findMostFrequentChar(text);
        System.out.println("Most Frequent Character: '" + result + "'");
    }
}
