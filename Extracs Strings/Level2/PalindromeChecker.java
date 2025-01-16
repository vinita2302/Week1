import java.util.Scanner;

public class PalindromeChecker {

    // Function to take input from the user
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }

    // Function to check if the given string is a palindrome
    public static boolean isPalindrome(String text) {
        text = text.toLowerCase().replaceAll("\\s", ""); // Convert to lowercase and remove spaces
        int start = 0, end = text.length() - 1;
        
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Function to display the result
    public static void displayResult(boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        // Get input from the user
        String input = getInput();
        
        // Check if the string is a palindrome
        boolean result = isPalindrome(input);
        
        // Display the result
        displayResult(result);
    }
}
