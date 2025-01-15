public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;  // Initialize the variable to null
        System.out.println("Generating NullPointerException...");
        // This will throw NullPointerException
        int length = text.length();  // Attempting to access a method on a null reference
    }

    // Method to handle NullPointerException using try-catch
    public static void handleException() {
        String text = null;  // Initialize the variable to null
        try {
            System.out.println("Handling NullPointerException...");
            int length = text.length();  // Attempting to access a method on a null reference
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Cannot call a method on a null object.");
        }
    }

    public static void main(String[] args) {
        // Call the method to generate the exception
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method to handle the exception
        handleException();
    }
}
