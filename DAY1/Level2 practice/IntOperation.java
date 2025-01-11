public class IntOperation {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input 
        System.out.print("Enter fee (a): ");
        int a = scanner.nextInt();
        
        System.out.print("Enter discount (b): ");
        int b = scanner.nextInt();
        
        System.out.print("Enter percent (c): ");
        int c = scanner.nextInt();

        // Perform the integer operations
        int result1 = a + b * c;  // a + (b * c)
        int result2 = a * b + c;  // (a * b) + c
        int result3 = c + a / b;  // c + (a / b)
        int result4 = a % b + c;  // (a % b) + c

        // Print the results
      System.out.println(" The results of Int Operations are: "+ result1 +","+ result2 +" and"+ result3+"," result4);     
        scanner.close();
    }
}