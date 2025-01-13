import java.util.Scanner; 

class FactorAnalysis{
  
  //create a method 
  
  public static int[] findFactors(int number) { 
  int count=0;  
  
  //find the number of factors and save in array 
  for(int i=1;i<=number;i++){
  if(number%i==0){
  count++;
  } 
  } 
  
  int[] factors=new int[count]; 
  int index=0; 
  
   for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    } 
	
	public static int sumOfFactors(int[] factors){
	int sum=0; 
	for(int i=0;i<factors.length;i++){
	sum=sum+factors[i]; 
	} 
	return sum; 
	}  
	
	  public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    } 
	
	   public static int sumOfSquares(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }
	
  
 public static void main(String[] args){
  Scanner scanner=new Scanner(System.in); 
  
  System.out.println("Enter a number: "); 
  int number=scanner.nextInt(); 
   
    int[] factors = findFactors(number);

        // Display factors
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Display 
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));

        scanner.close();
    }
}