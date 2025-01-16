public class RemoveDuplicates {

    // Method to remove duplicates from the string
    public static String removeDuplicates(String text) {
        // Initialize an empty string to store the result
        String result = "";

       
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Check if the character is already in the result string
            boolean found = false;

         
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == currentChar) {
                    found = true;  // Set flag to true if character is found
                    break;
                }
            }

           
            if (!found) {
                result += currentChar;
            }
        }

        // Return the string after removing duplicates
        return result;
    }

    public static void main(String[] args) {
        // Take the  String input 
        String input = "programming";

        // Call the removeDuplicates method
        String result = removeDuplicates(input);

        // Display the result
        System.out.println("String after removing duplicates: " + result);
    }
}
