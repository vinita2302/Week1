import java.util.Scanner;

public class PalindromeCheck {

    // Method to check if the given string is a palindrome
    public static boolean isPalindrome(String text) {
        // Convert the string to lowercase to handle case-insensitivity
        text = text.toLowerCase(); 
		int start=0,end=text.length()-1; 
		while(start<end){
		 if(text.charAt(start)!=text.charAt(end)){
			 return false; 
		 } 
		 start++; 
		 end--;
		 
		 }
		 return true;

     
    }

    public static void main(String[] args) {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        // Take string input
        System.out.println("Enter the string:");
        String text = scanner.nextLine();

        // Call the isPalindrome method
        if (isPalindrome(text)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
