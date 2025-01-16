import java.util.Scanner;

public class RemoveCharacter {

    // Method to remove all occurrences of a specific character from a string
    public static String removeCharacter(String str, char chToRemove) {
        // Replace occurrences of chToRemove with an empty string
        return str.replace(String.valueOf(chToRemove), "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the string and the character to remove as input
        System.out.println("Enter the string:");
        String str = scanner.nextLine();

        System.out.println("Enter the character to remove:");
        char chToRemove = scanner.next().charAt(0);

        // Call the method to remove the character and store the result
        String modifiedString = removeCharacter(str, chToRemove);

        // Display the modified string
        System.out.println("Modified String: " + modifiedString);
    }
}
