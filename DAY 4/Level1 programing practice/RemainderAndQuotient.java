import java.util.Scanner; 

public class RemainderAndQuotient{ 
//create a method 

public static int[]  findRemainderAndQuotient(int number1, int number2){
int reminder=number1/number2; 
int quotient=number1%number2; 

return new int[]{reminder,quotient} ;
}  




public static void main(String[] args){
//create Scanner object 
Scanner scanner=new Scanner(System.in); 
  
System.out.println("Enter the first number"); 
int number1=scanner.nextInt();  
 System.out.println("Enter the second number");  
int number2=scanner.nextInt(); 
  
int result[]=findRemainderAndQuotient(number1,number2); 
 
 System.out.println("The reminderof number is: "+result[0]); 
 System.out.println("The quotient of number is: "+result[1]); 
 } 
 }

 