import java.util.Scanner;

public class CharArrayComparison {

    // Method to return all characters in a string without using toCharArray()
    public static char[] getChars(String text) {
        int length = text.length();
        char[] charArray = new char[length];
        for (int i = 0; i < length; i++) {
            charArray[i] = text.charAt(i);
        }
        return charArray;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Get characters using the custom method
        char[] customCharArray = getChars(input);

        // Get characters using the built-in toCharArray() method
        char[] builtInCharArray = input.toCharArray();

        // Compare the two character arrays
        boolean comparisonResult = compareCharArrays(customCharArray, builtInCharArray);

        // Display the results
        System.out.println("\nCharacters using custom method: ");
        for (char c : customCharArray) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nCharacters using built-in method: ");
        for (char c : builtInCharArray) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both character arrays equal? " + comparisonResult);
    }
}
