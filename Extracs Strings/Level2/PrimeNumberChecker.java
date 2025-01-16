import java.util.Scanner; 
class PrimeNumberChecker{
//create a method to check the number is prime or not 
public static boolean isPrime(int number){
for(int i=2;i<number/2;i++){
if(number%i==0){
return false; 
} 
} 
return true; 
} 

public static void main(String[] args){
//create a Scanner object 
Scanner scanner=new Scanner(System.in); 
//Take a user input 
int number=scanner.nextInt(); 

//print the result 
if(isPrime(number)){
System.out.println("number is prime number"); 
} 
else{
System.out.println("number is not a prime number"); 
} 
}
}