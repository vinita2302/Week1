public class NumberChecker5 {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int[] factors = new int[number / 2]; 
        int count = 0;
        
        // Find factors
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factors[count] = i;
                count++;
            }
        }

      
        int[] relevantFactors = new int[count];
        System.arraycopy(factors, 0, relevantFactors, 0, count);
        
        return relevantFactors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int[] factors) {
        int greatest = factors[0];
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    // Method to find the sum of the factors using factors array
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using factors array
    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors using the factors array
    public static double findProductOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfFactors = findSumOfFactors(factors);
        return sumOfFactors == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfFactors = findSumOfFactors(factors);
        return sumOfFactors > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sumOfFactors = findSumOfFactors(factors);
        return sumOfFactors < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sumOfFactorials = 0;
        
        // Calculate sum of factorial of digits
        while (temp != 0) {
            int digit = temp % 10;
            sumOfFactorials += factorial(digit);
            temp /= 10;
        }

        return sumOfFactorials == number;
    }

    // Helper method to calculate factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int number = 28; // Example number

        // Find factors of the number
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Find the greatest factor
        System.out.println("Greatest factor: " + findGreatestFactor(factors));

        // Find the sum of factors
        System.out.println("Sum of factors: " + findSumOfFactors(factors));

        // Find the product of factors
        System.out.println("Product of factors: " + findProductOfFactors(factors));

        // Find the product of cubes of factors
        System.out.println("Product of cubes of factors: " + findProductOfCubesOfFactors(factors));

        // Check if the number is a perfect number
        System.out.println("Is perfect number: " + isPerfectNumber(number));

        // Check if the number is an abundant number
        System.out.println("Is abundant number: " + isAbundantNumber(number));

        // Check if the number is a deficient number
        System.out.println("Is deficient number: " + isDeficientNumber(number));

        // Check if the number is a strong number
        System.out.println("Is strong number: " + isStrongNumber(number));
    }
}
