import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Amar's age and height: ");
        int amarAge = scanner.nextInt();
        int amarHeight = scanner.nextInt();

        System.out.print("Enter Akbar's age and height: ");
        int akbarAge = scanner.nextInt();
        int akbarHeight = scanner.nextInt();

        System.out.print("Enter Anthony's age and height: ");
        int anthonyAge = scanner.nextInt();
        int anthonyHeight = scanner.nextInt();

       
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        System.out.print("The youngest friend is ");
        if (youngestAge == amarAge) {
            System.out.println("Amar.");
        } else if (youngestAge == akbarAge) {
            System.out.println("Akbar.");
        } else {
            System.out.println("Anthony.");
        }

        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        System.out.print("The tallest friend is ");
        if (tallestHeight == amarHeight) {
            System.out.println("Amar.");
        } else if (tallestHeight == akbarHeight) {
            System.out.println("Akbar.");
        } else {
            System.out.println("Anthony.");
        }

        scanner.close();
    }
}
