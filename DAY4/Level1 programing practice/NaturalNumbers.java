import java.util.Scanner; 
class NaturalNumbers{  

 
public int sumOfNatural(int number){ 
int sum=0;
for(int i=1;i<=number;i++){ 
sum=sum+i; 
} 
return sum; 
}

public static void main(String[] args){  
//create a scanner object
Scanner scanner=new Scanner(System.in);
  System.out.print("Enter a number: ");
        int number = scanner.nextInt();
 
        NaturalNumbers n=new NaturalNumbers();
        // Calculate the sum of first n natural numbers
        int sum = n.sumOfNatural(number);

        //  result
        System.out.println("The sum of the first " + number + " natural numbers is: " + sum);

        // Close the scanner 
        scanner.close();
} 
}