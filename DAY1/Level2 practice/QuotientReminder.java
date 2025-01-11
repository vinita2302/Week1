import java.util.Scanner;  
class QuotientReminder{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in); 
int quotient; 
int reminder;
System.out.println("write the first number");  
int number1=sc.nextInt();  
System.out.println("write the second number");  
int number2=sc.nextInt();  
 
quotient=number1/number2; 
reminder=number1%number2; 

System.out.println("The Quotient is: " + quotient + "and Reminder is: " + reminder + "of two number: " + number1 + "and " + number2); 


} 
}